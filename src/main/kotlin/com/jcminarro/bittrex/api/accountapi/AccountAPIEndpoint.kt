package com.jcminarro.bittrex.api.accountapi

import com.jcminarro.bittrex.api.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

private const val CURRENCY = "currency"
private const val QUANTITY = "quantity"
private const val ADDRESSS = "address"
private const val PAYMENT_ID = "paymentid"
private const val UUID = "uuid"
private const val MARKET = "market"

internal interface AccountAPIEndpoint {

    @GET("account/getbalances")
    fun getBalances(): Call<BittrexResponse<List<BalanceResponse>>>

    @GET("account/getbalance")
    fun getBalance(@Query(CURRENCY) currency: String): Call<BittrexResponse<BalanceResponse>>

    @GET("account/withdraw")
    fun withdraw(@Query(CURRENCY) currency: String,
                 @Query(QUANTITY) quantity: Double,
                 @Query(ADDRESSS) address: String,
                 @Query(PAYMENT_ID) paymentId: String? = null): Call<BittrexResponse<WithdrawalRequestedResponse>>

    @GET("account/getdepositaddress")
    fun getDepositAddress(@Query(CURRENCY) currency: String): Call<BittrexResponse<DepositAddressResponse>>

    @GET("account/getorder")
    fun getOrder(@Query(UUID) uuid: String): Call<BittrexResponse<OrderResponse>>

    @GET("account/getorderhistory")
    fun getOrderHistory(@Query(MARKET) market: String? = null): Call<BittrexResponse<List<OrderResponse>>>

     @GET("account/getwithdrawalhistory")
    fun getWithdrawalHisotry(@Query(CURRENCY) currency: String? = null): Call<BittrexResponse<List<WithdrawalResponse>>>

     @GET("account/getdeposithistory")
    fun getDepositHisotry(@Query(CURRENCY) currency: String? = null): Call<BittrexResponse<List<DepositResponse>>>
}