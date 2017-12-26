package com.jcminarro.bittrex

import com.jcminarro.bittrex.ResponseMother.CURRENCY_RESPONSE_MOTHER_baseAddress
import com.jcminarro.bittrex.ResponseMother.CURRENCY_RESPONSE_MOTHER_coinType
import com.jcminarro.bittrex.ResponseMother.CURRENCY_RESPONSE_MOTHER_currency
import com.jcminarro.bittrex.ResponseMother.CURRENCY_RESPONSE_MOTHER_currencyLong
import com.jcminarro.bittrex.ResponseMother.CURRENCY_RESPONSE_MOTHER_isActive
import com.jcminarro.bittrex.ResponseMother.CURRENCY_RESPONSE_MOTHER_minConfirmation
import com.jcminarro.bittrex.ResponseMother.CURRENCY_RESPONSE_MOTHER_txFee
import com.jcminarro.bittrex.ResponseMother.MARKET_RESPONSE_MOTHER_baseCurrency
import com.jcminarro.bittrex.ResponseMother.MARKET_RESPONSE_MOTHER_baseCurrencyLong
import com.jcminarro.bittrex.ResponseMother.MARKET_RESPONSE_MOTHER_created
import com.jcminarro.bittrex.ResponseMother.MARKET_RESPONSE_MOTHER_isActive
import com.jcminarro.bittrex.ResponseMother.MARKET_RESPONSE_MOTHER_marketCurrency
import com.jcminarro.bittrex.ResponseMother.MARKET_RESPONSE_MOTHER_marketCurrencyLong
import com.jcminarro.bittrex.ResponseMother.MARKET_RESPONSE_MOTHER_marketName
import com.jcminarro.bittrex.ResponseMother.MARKET_RESPONSE_MOTHER_minTradeSize
import com.jcminarro.bittrex.ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_ask
import com.jcminarro.bittrex.ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_baseVolume
import com.jcminarro.bittrex.ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_bid
import com.jcminarro.bittrex.ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_created
import com.jcminarro.bittrex.ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_high
import com.jcminarro.bittrex.ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_last
import com.jcminarro.bittrex.ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_low
import com.jcminarro.bittrex.ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_marketName
import com.jcminarro.bittrex.ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_openBuyOrders
import com.jcminarro.bittrex.ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_openSellOrders
import com.jcminarro.bittrex.ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_prevDay
import com.jcminarro.bittrex.ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_timestamp
import com.jcminarro.bittrex.ResponseMother.MARKET_SUMMARY_RESPONSE_MOTHER_volume
import com.jcminarro.bittrex.ResponseMother.ORDER_RESPONSE_quantity
import com.jcminarro.bittrex.ResponseMother.ORDER_RESPONSE_rate
import com.jcminarro.bittrex.ResponseMother.TICK_RESPONSE_MOTHER_ask
import com.jcminarro.bittrex.ResponseMother.TICK_RESPONSE_MOTHER_bid
import com.jcminarro.bittrex.ResponseMother.TICK_RESPONSE_MOTHER_last
import com.jcminarro.bittrex.ResponseMother.TRADE_MOTHER_fillType
import com.jcminarro.bittrex.ResponseMother.TRADE_MOTHER_id
import com.jcminarro.bittrex.ResponseMother.TRADE_MOTHER_orderType
import com.jcminarro.bittrex.ResponseMother.TRADE_MOTHER_price
import com.jcminarro.bittrex.ResponseMother.TRADE_MOTHER_quantity
import com.jcminarro.bittrex.ResponseMother.TRADE_MOTHER_timestamp
import com.jcminarro.bittrex.ResponseMother.TRADE_MOTHER_total
import com.jcminarro.bittrex.api.*
import java.text.SimpleDateFormat
import java.util.*

object ResponseMother {

    val DEFAULT_DATE: Date =
            SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
                                    .parse("1989-09-25T22:05:03")

    val MARKET_RESPONSE_MOTHER_marketCurrency: String = "LTC"
    val MARKET_RESPONSE_MOTHER_baseCurrency: String = "BTC"
    val MARKET_RESPONSE_MOTHER_marketCurrencyLong: String = "Litecoin"
    val MARKET_RESPONSE_MOTHER_baseCurrencyLong: String = "Bitcoin"
    val MARKET_RESPONSE_MOTHER_minTradeSize: Double = 0.01000000
    val MARKET_RESPONSE_MOTHER_marketName: String = "BTC-LTC"
    val MARKET_RESPONSE_MOTHER_isActive: Boolean = true
    val MARKET_RESPONSE_MOTHER_created: Date = DEFAULT_DATE

    val CURRENCY_RESPONSE_MOTHER_currency: String = "BTC"
    val CURRENCY_RESPONSE_MOTHER_currencyLong: String = "Bitcoin"
    val CURRENCY_RESPONSE_MOTHER_minConfirmation: Int = 2
    val CURRENCY_RESPONSE_MOTHER_txFee: Double = 0.00020000
    val CURRENCY_RESPONSE_MOTHER_isActive: Boolean = true
    val CURRENCY_RESPONSE_MOTHER_coinType: String = "BITCOIN"
    val CURRENCY_RESPONSE_MOTHER_baseAddress: String = "1p52lHoVR76PMDishab2YmRHsbekCdGquK"

    val TICK_RESPONSE_MOTHER_bid: Double = 2.05670368
    val TICK_RESPONSE_MOTHER_ask: Double = 3.35579531
    val TICK_RESPONSE_MOTHER_last: Double = 3.35579531

    val MARKET_SUMMARY_RESPONSE_MOTHER_marketName: String = "BTC-888"
    val MARKET_SUMMARY_RESPONSE_MOTHER_high: Double = 0.00000919
    val MARKET_SUMMARY_RESPONSE_MOTHER_low: Double = 0.00000820
    val MARKET_SUMMARY_RESPONSE_MOTHER_volume: Double = 74339.61396015
    val MARKET_SUMMARY_RESPONSE_MOTHER_last: Double = 0.00000820
    val MARKET_SUMMARY_RESPONSE_MOTHER_baseVolume: Double = 0.64966963
    val MARKET_SUMMARY_RESPONSE_MOTHER_timestamp: Date = DEFAULT_DATE
    val MARKET_SUMMARY_RESPONSE_MOTHER_bid: Double = 0.00000820
    val MARKET_SUMMARY_RESPONSE_MOTHER_ask: Double = 0.00000831
    val MARKET_SUMMARY_RESPONSE_MOTHER_openBuyOrders: Int = 15
    val MARKET_SUMMARY_RESPONSE_MOTHER_openSellOrders: Int = 15
    val MARKET_SUMMARY_RESPONSE_MOTHER_prevDay: Double = 0.00000821
    val MARKET_SUMMARY_RESPONSE_MOTHER_created: Date = DEFAULT_DATE

    val TRADE_MOTHER_id: Int = 319435
    val TRADE_MOTHER_timestamp: Date = DEFAULT_DATE
    val TRADE_MOTHER_quantity: Double = 0.30802438
    val TRADE_MOTHER_price: Double = 0.01263400
    val TRADE_MOTHER_total: Double = 0.00389158
    val TRADE_MOTHER_fillType: String = "FILL"
    val TRADE_MOTHER_orderType: String = "BUY"

    val ORDER_RESPONSE_quantity: Double = 12.37000000
    val ORDER_RESPONSE_rate: Double = 0.02525000
}

internal fun createMarketResponse(marketCurrency: String = MARKET_RESPONSE_MOTHER_marketCurrency,
                                  baseCurrency: String = MARKET_RESPONSE_MOTHER_baseCurrency,
                                  marketCurrencyLong: String = MARKET_RESPONSE_MOTHER_marketCurrencyLong,
                                  baseCurrencyLong: String = MARKET_RESPONSE_MOTHER_baseCurrencyLong,
                                  minTradeSize: Double = MARKET_RESPONSE_MOTHER_minTradeSize,
                                  marketName: String = MARKET_RESPONSE_MOTHER_marketName,
                                  isActive: Boolean = MARKET_RESPONSE_MOTHER_isActive,
                                  created: Date = MARKET_RESPONSE_MOTHER_created) =
        MarketResponse(marketCurrency,
                baseCurrency,
                marketCurrencyLong,
                baseCurrencyLong,
                minTradeSize,
                marketName,
                isActive,
                created)

internal fun createCurrencyResponse(currency: String = CURRENCY_RESPONSE_MOTHER_currency,
                                    currencyLong: String = CURRENCY_RESPONSE_MOTHER_currencyLong,
                                    minConfirmation: Int = CURRENCY_RESPONSE_MOTHER_minConfirmation,
                                    txFee: Double = CURRENCY_RESPONSE_MOTHER_txFee,
                                    isActive: Boolean = CURRENCY_RESPONSE_MOTHER_isActive,
                                    coinType: String = CURRENCY_RESPONSE_MOTHER_coinType,
                                    baseAddress: String = CURRENCY_RESPONSE_MOTHER_baseAddress) =
        CurrencyResponse(currency,
                currencyLong,
                minConfirmation,
                txFee,
                isActive,
                coinType,
                baseAddress)

internal fun createTickResponse(bid: Double = TICK_RESPONSE_MOTHER_bid,
                                ask: Double = TICK_RESPONSE_MOTHER_ask,
                                last: Double = TICK_RESPONSE_MOTHER_last) =
        TickResponse(bid, ask, last)

internal fun createMarketSummaryResponse(marketName: String = MARKET_SUMMARY_RESPONSE_MOTHER_marketName,
                                         high: Double = MARKET_SUMMARY_RESPONSE_MOTHER_high,
                                         low: Double = MARKET_SUMMARY_RESPONSE_MOTHER_low,
                                         volume: Double = MARKET_SUMMARY_RESPONSE_MOTHER_volume,
                                         last: Double = MARKET_SUMMARY_RESPONSE_MOTHER_last,
                                         baseVolume: Double = MARKET_SUMMARY_RESPONSE_MOTHER_baseVolume,
                                         timestamp: Date = MARKET_SUMMARY_RESPONSE_MOTHER_timestamp,
                                         bid: Double = MARKET_SUMMARY_RESPONSE_MOTHER_bid,
                                         ask: Double = MARKET_SUMMARY_RESPONSE_MOTHER_ask,
                                         openBuyOrders: Int = MARKET_SUMMARY_RESPONSE_MOTHER_openBuyOrders,
                                         openSellOrders: Int = MARKET_SUMMARY_RESPONSE_MOTHER_openSellOrders,
                                         prevDay: Double = MARKET_SUMMARY_RESPONSE_MOTHER_prevDay,
                                         created: Date = MARKET_SUMMARY_RESPONSE_MOTHER_created) =
        MarketSummaryResponse(marketName,
                high,
                low,
                volume,
                last,
                baseVolume,
                timestamp,
                bid,
                ask,
                openBuyOrders,
                openSellOrders,
                prevDay,
                created)

internal fun createOrderResponse(quantity: Double = ORDER_RESPONSE_quantity,
                                 rate: Double = ORDER_RESPONSE_rate) =
        OrderResponse(quantity, rate)

internal fun createOrderbookResponse(buy: List<OrderResponse> = listOf(),
                                     sell: List<OrderResponse> = listOf()) =
        OrderbookResponse(buy, sell)

internal fun createTradeResponse(id: Int = TRADE_MOTHER_id,
                                 timestamp: Date = TRADE_MOTHER_timestamp,
                                 quantity: Double = TRADE_MOTHER_quantity,
                                 price: Double = TRADE_MOTHER_price,
                                 total: Double = TRADE_MOTHER_total,
                                 fillType: String = TRADE_MOTHER_fillType,
                                 orderType: String = TRADE_MOTHER_orderType) =
        TradeResponse(id,
                timestamp,
                quantity,
                price,
                total,
                fillType,
                orderType)
