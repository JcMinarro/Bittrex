package com.jcminarro.bittrex

import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.core.WireMockConfiguration
import com.github.tomakehurst.wiremock.junit.WireMockRule
import com.jcminarro.bittrex.api.RetrofitFactory
import org.amshove.kluent.`should be`
import org.amshove.kluent.`should equal to`
import org.amshove.kluent.`should equal`
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class BittrexTest {

    val DEFAULT_API_HOST = "http://localhost:"

    private lateinit var bittrex: Bittrex

    @Rule
    @JvmField
    val wiremockRule = WireMockRule(WireMockConfiguration.options().dynamicPort())

    @Before
    fun setUp() {
        RetrofitFactory.baseApiUrl = DEFAULT_API_HOST + wiremockRule.port()
        givenNonBlankCredentials()
    }

    @Test
    fun `Should return a list of Markets`() {
        stubFor(get(EndpointPath.GET_MARKETS)
                .willReturn(aResponse().withBody(
                        createMarketsResponseJson())))

        val markets = bittrex.getMarkets()

        markets.size `should be` 1
        with(markets[0]) {
            marketCurrencySymbol `should equal to` ResponseMother.MARKET_RESPONSE_MOTHER_marketCurrency
            marketCurrencyName `should equal to` ResponseMother.MARKET_RESPONSE_MOTHER_marketCurrencyLong
            baseCurrencySymbol `should equal to` ResponseMother.MARKET_RESPONSE_MOTHER_baseCurrency
            baseCurrencyName `should equal to` ResponseMother.MARKET_RESPONSE_MOTHER_baseCurrencyLong
            name `should equal to` ResponseMother.MARKET_RESPONSE_MOTHER_marketName
            minTradeSize `should equal to` ResponseMother.MARKET_RESPONSE_MOTHER_minTradeSize
            active `should equal to` ResponseMother.MARKET_RESPONSE_MOTHER_isActive
            created `should equal` ResponseMother.MARKET_RESPONSE_MOTHER_created
        }
    }

    @Test
    fun `Should return a list of currencies`() {
        stubFor(get(EndpointPath.GET_CURRENCIES)
                .willReturn(aResponse().withBody(
                        createCurrenciesResponseJson())))

        val currencies = bittrex.getCurrencies()

        currencies.size `should be` 1
        with(currencies[0]) {
            name `should equal to` ResponseMother.CURRENCY_RESPONSE_MOTHER_currencyLong
            symbol `should equal to` ResponseMother.CURRENCY_RESPONSE_MOTHER_currency
            minConfirmation `should equal to` ResponseMother.CURRENCY_RESPONSE_MOTHER_minConfirmation
            txFee `should equal to` ResponseMother.CURRENCY_RESPONSE_MOTHER_txFee
            active `should equal to` ResponseMother.CURRENCY_RESPONSE_MOTHER_isActive
            coinType `should equal to` ResponseMother.CURRENCY_RESPONSE_MOTHER_coinType
        }
    }

    @Test
    fun `Should return a tick`() {
        stubFor(get(EndpointPath.GET_TICK)
                .willReturn(aResponse().withBody(
                        createTickResponseJson())))

        val tick = bittrex.getTick("BTC-ETH")

        tick.ask `should equal to` ResponseMother.TICK_RESPONSE_MOTHER_ask
        tick.bid `should equal to` ResponseMother.TICK_RESPONSE_MOTHER_bid
        tick.last `should equal to` ResponseMother.TICK_RESPONSE_MOTHER_last
    }

    @Test
    fun `Should return a list of Market Summaries`() {
        stubFor(get(EndpointPath.GET_MARKET_SUMMARIES)
                .willReturn(aResponse().withBody(
                        createMarketSummariesResponseJson())))

        val marketSummaries = bittrex.getMarketSummaries()

        marketSummaries.size `should be` 1
        with(marketSummaries[0]) {
            name `should equal to` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_marketName
            high `should equal to` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_high
            low `should equal to` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_low
            volume `should equal to` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_volume
            baseVolume `should equal to` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_baseVolume
            bid `should equal to` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_bid
            ask `should equal to` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_ask
            prevDay `should equal to` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_prevDay
            openBuyOrders `should equal to` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_openBuyOrders
            openSellOrders `should equal to` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_openSellOrders
            timestamp `should equal` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_timestamp
            created `should equal` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_created
        }
    }

    @Test
    fun `Should return a Market Summary`() {
        stubFor(get(EndpointPath.GET_MARKET_SUMMARY)
                .willReturn(aResponse().withBody(
                        createMarketSummariesResponseJson())))

        val marketSummary = bittrex.getMarketSummary("BTC-ETH")

        marketSummary.name `should equal to` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_marketName
        marketSummary.high `should equal to` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_high
        marketSummary.low `should equal to` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_low
        marketSummary.volume `should equal to` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_volume
        marketSummary.baseVolume `should equal to` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_baseVolume
        marketSummary.bid `should equal to` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_bid
        marketSummary.ask `should equal to` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_ask
        marketSummary.prevDay `should equal to` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_prevDay
        marketSummary.openBuyOrders `should equal to` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_openBuyOrders
        marketSummary.openSellOrders `should equal to` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_openSellOrders
        marketSummary.timestamp `should equal` ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_timestamp
        marketSummary.created `should equal` ResponseMother.MARKET_RESPONSE_MOTHER_created
    }

    @Test
    fun `Should return Orderbook`() {
        stubFor(get(EndpointPath.GET_ORDERBOOK)
                .willReturn(aResponse().withBody(
                        createOrderbookResponseJson())))

        val orderbook = bittrex.getOrderbook("BTC-ETH")

        orderbook.buy.size `should equal to` 1
        orderbook.sell.size `should equal to` 1
        with(orderbook.buy[0]) {
            quantity `should equal to` ResponseMother.ORDER_RESPONSE_quantity
            rate `should equal to` ResponseMother.ORDER_RESPONSE_rate
        }
        with(orderbook.sell[0]) {
            quantity `should equal to` ResponseMother.ORDER_RESPONSE_quantity
            rate `should equal to` ResponseMother.ORDER_RESPONSE_rate
        }
    }

    @Test
    fun `Should return MarketHistory`() {
        stubFor(get(EndpointPath.GET_MARKET_HISOTRY)
                .willReturn(aResponse().withBody(
                        createMarketHistoryResponseJson(
                                listOf(
                                        createTradeResponse(fillType = "fill",
                                                orderType = "buy"),
                                        createTradeResponse(fillType = "partial_fill",
                                                orderType = "sell")
                                )
                        ))))

        val marketHistory = bittrex.getMarketHistory("BTC-ETH")

        marketHistory.size `should equal to` 2
        with(marketHistory[0]) {
            id `should equal to` ResponseMother.TRADE_MOTHER_id
            timestamp `should equal` ResponseMother.TRADE_MOTHER_timestamp
            quantity `should equal to` ResponseMother.TRADE_MOTHER_quantity
            price `should equal to` ResponseMother.TRADE_MOTHER_price
            total `should equal to` ResponseMother.TRADE_MOTHER_total
            fillType `should equal` FillType.FILL
            orderType `should equal` OrderType.BUY
        }
        with(marketHistory[1]) {
            id `should equal to` ResponseMother.TRADE_MOTHER_id
            timestamp `should equal` ResponseMother.TRADE_MOTHER_timestamp
            quantity `should equal to` ResponseMother.TRADE_MOTHER_quantity
            price `should equal to` ResponseMother.TRADE_MOTHER_price
            total `should equal to` ResponseMother.TRADE_MOTHER_total
            fillType `should equal` FillType.PARTIAL_FILL
            orderType `should equal` OrderType.SELL
        }
    }

    @Test(expected = IllegalBittrexCredentialsException::class)
    fun `Should throw and exception if try to get balances without Credentials`() {
        givenBlankCredentials()

        bittrex.getBalances()
    }

    @Test(expected = IllegalBittrexCredentialsException::class)
    fun `Should throw and exception if try to get balance without Credentials`() {
        givenBlankCredentials()

        bittrex.getBalance("BTC")
    }

    @Test(expected = IllegalBittrexCredentialsException::class)
    fun `Should throw and exception if try to get OrderHistory without Credentials`() {
        givenBlankCredentials()

        bittrex.getOrderHistory()
    }

    @Test(expected = IllegalBittrexCredentialsException::class)
    fun `Should throw and exception if try to get Order without Credentials`() {
        givenBlankCredentials()

        bittrex.getOrder("c9887575-b22b-4a78-9752-32c33de5c0f6")
    }

    @Test(expected = IllegalBittrexCredentialsException::class)
    fun `Should throw and exception if try to get WithdrawalHistory without Credentials`() {
        givenBlankCredentials()

        bittrex.getWithdrawalHistory()
    }

    @Test(expected = IllegalBittrexCredentialsException::class)
    fun `Should throw and exception if try to withdraw without Credentials`() {
        givenBlankCredentials()

        bittrex.withdraw("BTC", 250.025, "1p52lHoVR76PMDishab2YmRHsbekCdGquK", "Payment note")
    }

    @Test(expected = IllegalBittrexCredentialsException::class)
    fun `Should throw and exception if try to get DepositAddress without Credentials`() {
        givenBlankCredentials()

        bittrex.getDepositAddress("BTC")
    }

    @Test(expected = IllegalBittrexCredentialsException::class)
    fun `Should throw and exception if try to get DepositHistory without Credentials`() {
        givenBlankCredentials()

        bittrex.getDepositHistory()
    }

    private fun givenBlankCredentials() {
        bittrex = Bittrex()
    }

    private fun givenNonBlankCredentials() {
        bittrex = Bittrex(BittrexCredentials("SomeAPIKey", "SomeSecret"))
    }
}