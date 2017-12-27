package com.jcminarro.bittrex

import java.util.*

typealias MarketHistory = List<Trade>

data class Market(val marketCurrencySymbol: String,
                  val marketCurrencyName: String,
                  val baseCurrencySymbol: String,
                  val baseCurrencyName: String,
                  val name: String,
                  val minTradeSize: Double,
                  val active: Boolean,
                  val created: Date)

data class Currency(val name: String,
                    val symbol: String,
                    val minConfirmation: Int,
                    val txFee: Double,
                    val active: Boolean,
                    val coinType: String)

data class Tick(val bid: Double,
                val ask: Double,
                val last: Double)

data class MarketSummary(val name: String,
                         val high: Double,
                         val low: Double,
                         val volume: Double,
                         val last: Double,
                         val baseVolume: Double,
                         val bid: Double,
                         val ask: Double,
                         val prevDay: Double,
                         val openBuyOrders: Int,
                         val openSellOrders: Int,
                         val timestamp: Date,
                         val created: Date)

data class OrderbookEntry(val quantity: Double,
                 val rate: Double)

data class Orderbook(val buy: List<OrderbookEntry>,
                     val sell: List<OrderbookEntry>)

data class Trade(val id: Int,
                 val timestamp: Date,
                 val quantity: Double,
                 val price: Double,
                 val total: Double,
                 val fillType: FillType,
                 val orderType: OrderType)

data class BittrexCredentials(val key: String,
                              val secret: String) {
    internal fun isNotBlank() = key.isNotBlank() && secret.isNotBlank()
}

val NON_CREDENTIAL = BittrexCredentials("", "")

enum class FillType {
    FILL,
    PARTIAL_FILL
}

enum class OrderType {
    BUY,
    SELL
}