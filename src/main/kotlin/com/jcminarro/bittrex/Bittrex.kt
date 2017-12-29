package com.jcminarro.bittrex

import com.jcminarro.bittrex.api.accountapi.AccountAPI
import com.jcminarro.bittrex.api.publicapi.PublicAPI

class Bittrex(bittrexCredentials: BittrexCredentials = NON_CREDENTIAL) {

    private val publicApi by lazy { PublicAPI(bittrexCredentials) }
    private val accountApi by lazy { AccountAPI(bittrexCredentials) }

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

    @Throws(BittrexException::class)
    fun getBalances() = accountApi.getBalances()

    @Throws(BittrexException::class)
    fun getBalance(currency: String) = accountApi.getBalance(currency)

    @Throws(BittrexException::class)
    fun getDepositAddress(currency: String) = accountApi.getDepositAddress(currency)

    @Throws(BittrexException::class)
    fun getOrderHistory(market:String? = null) = accountApi.getOrderHistory(market)

    @Throws(BittrexException::class)
    fun getOrder(uuid: String) = accountApi.getOrder(uuid)

    @Throws(BittrexException::class)
    fun getWithdrawalHistory() = accountApi.getWithdrawalHistotry()

    @Throws(BittrexException::class)
    fun getDepositHistory() = accountApi.getDepositHistory()

    @Throws(BittrexException::class)
    fun withdraw(currency: String, quantity: Double, address: String, paymentId: String? = null): WithdrawalRequested =
            accountApi.withdraw(currency, quantity, address, paymentId)
}