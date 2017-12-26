package com.jcminarro.bittrex.api

import com.jcminarro.bittrex.BittrexCredentials
import com.jcminarro.bittrex.BittrexException
import com.jcminarro.bittrex.BittrexIOException
import retrofit2.Call

open class APIClient<out T>(bittrexCredentials: BittrexCredentials, service: Class<T>){
    val endpoint: T = RetrofitFactory.create(bittrexCredentials, service)


    @Throws(BittrexException::class)
    fun <U> evaluateCall(apiCallFunction: () -> Call<BittrexResponse<U>>): U {
        val response = apiCallFunction().execute()
        if (!response.isSuccessful) {
            throw BittrexIOException(response.errorBody().toString())
        } else if (!response.body().success) {
            throw Exception(response.body().message)
        }
        return response.body().result
    }
}