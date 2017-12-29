package com.jcminarro.bittrex

import java.util.*

typealias MarketHistory = List<Trade>
typealias BalanceHistory = List<Balance>
typealias WithdrawalHistory = List<Withdrawal>
typealias DepositHistory = List<Deposit>
typealias OrderHistory = List<Order>

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

data class Balance(
        val currency: String,
        val balance: Double,
        val available: Double,
        val pending: Double,
        val cryptoAddress: String,
        val requested: Boolean,
        val uuid: String)

data class DepositAddress(
        val currency: String,
        val address: String
)

data class WithdrawalRequested(val uuid: String)

data class Order(
        val orderUuid: String,
        val exchange: String,
        val orderType: OrderType,
        val quantity: Double,
        val quantityRemaining: Double,
        val limit: Double,
        val commissionPaid: Double,
        val price: Double,
        val pricePerUnit: Double,
        val opened: Date,
        val closed: Date?,
        val cancelInitiated: Boolean,
        val immediateOrCancel: Boolean,
        val isConditional: Boolean,
        val condition: String?,
        val conditionTarget: String)

data class Withdrawal(
        val paymentUuid: String,
        val currency: String,
        val amount: Double,
        val address: String,
        val opened: Date,
        val authorized: Boolean,
        val pendingPayment: Boolean,
        val txCost: Double,
        val txId: String,
        val canceled: Boolean,
        val invalidAddress: Boolean)

data class Deposit(
        val id: Int,
        val amount: Double,
        val currency: String,
        val confirmations: Int,
        val lastUpdated: Date,
        val txId: String,
        val cryptoAddress: String)

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