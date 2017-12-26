package com.jcminarro.bittrex.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

private const val MARKET: String = "market"
private const val TYPE: String = "type"

internal interface PublicAPIEndpoint {

    @GET("public/getmarkets")
    fun getMarkets(): Call<BittrexResponse<List<MarketResponse>>>

    @GET("public/getcurrencies")
    fun getCurrencies(): Call<BittrexResponse<List<CurrencyResponse>>>

    @GET("public/getticker")
    fun getTick(@Query(MARKET) market: String): Call<BittrexResponse<TickResponse>>

    @GET("public/getmarketsummaries")
    fun getMarketSummaries(): Call<BittrexResponse<List<MarketSummaryResponse>>>

    @GET("public/getmarketsummary")
    fun getMarketSummary(@Query(MARKET) market: String): Call<BittrexResponse<List<MarketSummaryResponse>>>

    @GET("public/getorderbook")
    fun getOrderBook(@Query(MARKET) market: String,
                     @Query(TYPE) type: OrderTypeQueryParam): Call<BittrexResponse<OrderbookResponse>>

    @GET("public/getmarkethistory")
    fun getMarketHistory(@Query(MARKET) market: String): Call<BittrexResponse<List<TradeResponse>>>
}

enum class OrderTypeQueryParam(private val queryParamName: String) {
    BUY("buy"),
    SELL("sell"),
    BOTH("both");

    override fun toString(): String = queryParamName
}