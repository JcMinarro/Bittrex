package com.jcminarro.bittrex.api

import com.google.gson.GsonBuilder
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.moczul.ok2curl.CurlInterceptor
import okhttp3.ConnectionPool
import okhttp3.OkHttpClient
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


object RetrofitFactory {

    private val CONNECT_TIMEOUT_SECONDS = 60L
    private val READ_TIMEOUT_SECONDS = 60L
    private val CONNECTION_POOL = ConnectionPool()
    private const val BITTREX_BASE_URL = "https://bittrex.com/api/v1.1/"
    internal var baseApiUrl = BITTREX_BASE_URL

    fun <T> create(service: Class<T>) =
            Retrofit
                    .Builder()
                    .baseUrl(baseApiUrl)
                    .client(getDefaultHttpClient())
                    .addConverterFactory(getConverterFactory())
                    .build()
                    .create(service)

    private fun getConverterFactory() =
            GsonConverterFactory
                    .create(
                            GsonBuilder()
                                    .registerTypeAdapter(Date::class.java, DateDeserializer())
                                    .create())


    private fun getDefaultHttpClient(): OkHttpClient =
            OkHttpClient.Builder()
                    .connectionPool(CONNECTION_POOL)
                    .connectTimeout(CONNECT_TIMEOUT_SECONDS, TimeUnit.SECONDS)
                    .readTimeout(READ_TIMEOUT_SECONDS, TimeUnit.SECONDS)
                    .addInterceptor(CurlInterceptor({ println(it) }))
                    .addInterceptor(HttpLoggingInterceptor({ println(it) }).setLevel(HttpLoggingInterceptor.Level.BASIC))
                    .build()
}

private class DateDeserializer : JsonDeserializer<Date> {

    private val DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss"
    private val sdf = SimpleDateFormat(DATE_FORMAT)

    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): Date =
            sdf.parse(json.asJsonPrimitive.asString)

}