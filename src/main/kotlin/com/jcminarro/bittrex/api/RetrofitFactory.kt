package com.jcminarro.bittrex.api

import com.google.gson.GsonBuilder
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.jcminarro.bittrex.BittrexCredentials
import com.moczul.ok2curl.CurlInterceptor
import okhttp3.ConnectionPool
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.reflect.Type
import java.security.InvalidKeyException
import java.security.NoSuchAlgorithmException
import java.security.SecureRandom
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec


object RetrofitFactory {

    private val CONNECT_TIMEOUT_SECONDS = 60L
    private val READ_TIMEOUT_SECONDS = 60L
    private val CONNECTION_POOL = ConnectionPool()
    private const val BITTREX_BASE_URL = "https://bittrex.com/api/v1.1/"
    internal var baseApiUrl = BITTREX_BASE_URL

    fun <T> create(bittrexCredentials: BittrexCredentials, service: Class<T>) =
            Retrofit
                    .Builder()
                    .baseUrl(baseApiUrl)
                    .client(getDefaultHttpClient(bittrexCredentials))
                    .addConverterFactory(getConverterFactory())
                    .build()
                    .create(service)

    private fun getConverterFactory() =
            GsonConverterFactory
                    .create(
                            GsonBuilder()
                                    .registerTypeAdapter(Date::class.java, DateDeserializer())
                                    .create())


    private fun getDefaultHttpClient(bittrexCredentials: BittrexCredentials): OkHttpClient =
            OkHttpClient.Builder()
                    .connectionPool(CONNECTION_POOL)
                    .connectTimeout(CONNECT_TIMEOUT_SECONDS, TimeUnit.SECONDS)
                    .readTimeout(READ_TIMEOUT_SECONDS, TimeUnit.SECONDS)
                    .addInterceptor(APISignerInterceptor(bittrexCredentials))
                    .addInterceptor(CurlInterceptor({ println(it) }))
                    .addInterceptor(HttpLoggingInterceptor({ println(it) }).setLevel(HttpLoggingInterceptor.Level.BASIC))
                    .build()
}

internal class APISignerInterceptor(private val bittrexCredentials: BittrexCredentials) : Interceptor {

    private val QUERY_PARAM_NONCE = "nonce"
    private val QUERY_PARAM_API_KEY = "apikey"
    private val HEADER_API_SIGN = "apisign"
    private val ALGORITHM = "HmacSHA512"
    private val NONCE_BYTE_LENGTH = 32
    private val random = SecureRandom()

    override fun intercept(chain: Interceptor.Chain): Response =
            chain.proceed(
                    if (bittrexCredentials.isNotBlank()) {
                        val oldRequest = chain.request()
                        val url = oldRequest
                                .url()
                                .newBuilder()
                                .addQueryParameter(QUERY_PARAM_NONCE, generateNonce())
                                .addQueryParameter(QUERY_PARAM_API_KEY, bittrexCredentials.key)
                                .build()
                        oldRequest
                                .newBuilder()
                                .url(url)
                                .addHeader(HEADER_API_SIGN, signAPI(url.toString()))
                                .build()
                    } else {
                        chain.request()
                    }
            )

    private fun signAPI(url: String): String =
            bytesToHexString(calculateSignBytes(url))

    private fun generateNonce(): String {
        val bytes = ByteArray(NONCE_BYTE_LENGTH)
        random.nextBytes(bytes)
        return Base64.getEncoder().encodeToString(bytes)
    }

    private fun calculateSignBytes(url: String): ByteArray =
            try {
                val mac = Mac.getInstance(ALGORITHM)
                val secretKeySpec = SecretKeySpec(bittrexCredentials.secret.toByteArray(), ALGORITHM)
                mac.init(secretKeySpec)
                mac.doFinal(url.toByteArray())
            } catch (e: NoSuchAlgorithmException) {
                throw RuntimeException(e)
            } catch (e: InvalidKeyException) {
                throw RuntimeException(e)
            }

    private fun bytesToHexString(bytes: ByteArray): String {
        val stringBuilder = StringBuilder()
        for (b in bytes) {
            stringBuilder.append(String.format("%02x", b))
        }
        return stringBuilder.toString()
    }
}

private class DateDeserializer : JsonDeserializer<Date> {

    private val DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss"
    private val sdf = SimpleDateFormat(DATE_FORMAT)

    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): Date =
            sdf.parse(json.asJsonPrimitive.asString)

}