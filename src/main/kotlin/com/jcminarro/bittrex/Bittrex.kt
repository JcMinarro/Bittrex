package com.jcminarro.bittrex

import com.jcminarro.bittrex.api.publicapi.PublicAPI

class Bittrex(bittrexCredentials: BittrexCredentials = NON_CREDENTIAL) {

    private val publicApi by lazy { PublicAPI(bittrexCredentials) }

    @Throws(BittrexException::class)
    fun getMarkets() = publicApi.getMarkets()

    @Throws(BittrexException::class)
    fun getCurrencies() = publicApi.getCurrencies()

    @Throws(BittrexException::class)
    fun getTick(market: String) = publicApi.getTick(market)

    @Throws(BittrexException::class)
    fun getMarketSummaries() = publicApi.getMarketSummaries()

    @Throws(BittrexException::class)
    fun getMarketSummary(market: String) = publicApi.getMarketSummary(market)                   

    @Throws(BittrexException::class)
    fun getOrderbook(market: String, vararg orderType: OrderType) = publicApi.getOrderbook(market, arrayOf(*orderType))

    @Throws(BittrexException::class)
    fun getMarketHistory(market: String) = publicApi.getMarketHistory(market)
}