package com.jcminarro.bittrex.api

import com.google.gson.annotations.SerializedName
import java.util.*

data class BittrexResponse<out T>(@SerializedName("success") val success: Boolean,
                                  @SerializedName("message") val message: String,
                                  @SerializedName("result") val result: T)

internal data class MarketResponse(
        @SerializedName("MarketCurrency") val marketCurrency: String,
        @SerializedName("BaseCurrency") val baseCurrency: String,
        @SerializedName("MarketCurrencyLong") val marketCurrencyLong: String,
        @SerializedName("BaseCurrencyLong") val baseCurrencyLong: String,
        @SerializedName("MinTradeSize") val minTradeSize: Double,
        @SerializedName("MarketName") val marketName: String,
        @SerializedName("IsActive") val isActive: Boolean,
        @SerializedName("Created") val created: Date)

internal data class CurrencyResponse(
        @SerializedName("Currency") val currency: String,
        @SerializedName("CurrencyLong") val currencyLong: String,
        @SerializedName("MinConfirmation") val minConfirmation: Int,
        @SerializedName("TxFee") val txFee: Double,
        @SerializedName("IsActive") val isActive: Boolean,
        @SerializedName("CoinType") val coinType: String,
        @SerializedName("BaseAddress") val baseAddress: String)

internal data class TickResponse(
        @SerializedName("Bid") val bid: Double,
        @SerializedName("Ask") val ask: Double,
        @SerializedName("Last") val last: Double)

internal data class MarketSummaryResponse(
        @SerializedName("MarketName") val marketName: String,
        @SerializedName("High") val high: Double,
        @SerializedName("Low") val low: Double,
        @SerializedName("Volume") val volume: Double,
        @SerializedName("Last") val last: Double,
        @SerializedName("BaseVolume") val baseVolume: Double,
        @SerializedName("TimeStamp") val timestamp: Date,
        @SerializedName("Bid") val bid: Double,
        @SerializedName("Ask") val ask: Double,
        @SerializedName("OpenBuyOrders") val openBuyOrders: Int,
        @SerializedName("OpenSellOrders") val openSellOrders: Int,
        @SerializedName("PrevDay") val prevDay: Double,
        @SerializedName("Created") val created: Date)

internal data class OrderbookEntryResponse(
        @SerializedName("Quantity") val quantity: Double,
        @SerializedName("Rate") val rate: Double)

internal data class OrderbookResponse(
        @SerializedName("Buy") val buy: List<OrderbookEntryResponse>,
        @SerializedName("Sell") val sell: List<OrderbookEntryResponse>)

internal data class TradeResponse(
        @SerializedName("Id") val id: Int,
        @SerializedName("TimeStamp") val timestamp: Date,
        @SerializedName("Quantity") val quantity: Double,
        @SerializedName("Price") val price: Double,
        @SerializedName("Total") val total: Double,
        @SerializedName("FillType") val fillType: String,
        @SerializedName("OrderType") val orderType: String)

internal data class BalanceResponse(
        @SerializedName("Currency") val currency: String,
        @SerializedName("Balance") val balance: Double,
        @SerializedName("Available") val available: Double,
        @SerializedName("Pending") val pending: Double,
        @SerializedName("CryptoAddress") val cryptoAddress: String?,
        @SerializedName("Requested") val requested: Boolean?,
        @SerializedName("Uuid") val uuid: String?)

internal data class DepositAddressResponse(
        @SerializedName("Currency") val currency: String,
        @SerializedName("Address") val address: String
)

internal data class WithdrawalRequestedResponse(@SerializedName("uuid") val uuid: String)

internal data class OrderResponse(
        @SerializedName("OrderUuid") val orderUuid: String,
        @SerializedName("Exchange") val exchange: String,
        @SerializedName("OrderType") val orderType: String,
        @SerializedName("Quantity") val quantity: Double,
        @SerializedName("QuantityRemaining") val quantityRemaining: Double,
        @SerializedName("Limit") val limit: Double,
        @SerializedName("Commission") val commissionPaid: Double,
        @SerializedName("Price") val price: Double,
        @SerializedName("PricePerUnit") val pricePerUnit: Double,
        @SerializedName("TimeStamp") val opened: Date?,
        @SerializedName("Closed") val closed: Date?,
        @SerializedName("CancelInitiated") val cancelInitiated: Boolean,
        @SerializedName("ImmediateOrCancel") val immediateOrCancel: Boolean,
        @SerializedName("IsConditional") val isConditional: Boolean,
        @SerializedName("Condition") val condition: String?,
        @SerializedName("ConditionTarget") val conditionTarget: String?)

internal data class WithdrawalResponse(
        @SerializedName("PaymentUuid") val paymentUuid: String,
        @SerializedName("Currency") val currency: String,
        @SerializedName("Amount") val amount: Double,
        @SerializedName("Address") val address: String,
        @SerializedName("Opened") val opened: Date,
        @SerializedName("Authorized") val authorized: Boolean,
        @SerializedName("PendingPayment") val pendingPayment: Boolean,
        @SerializedName("TxCost") val txCost: Double,
        @SerializedName("TxId") val txId: String,
        @SerializedName("Canceled") val canceled: Boolean,
        @SerializedName("InvalidAddress") val invalidAddress: Boolean)

internal data class DepositResponse(
        @SerializedName("Id") val id: Int,
        @SerializedName("Amount") val amount: Double,
        @SerializedName("Currency") val currency: String,
        @SerializedName("Confirmations") val confirmations: Int,
        @SerializedName("LastUpdated") val lastUpdated: Date,
        @SerializedName("TxId") val txId: String,
        @SerializedName("CryptoAddress") val cryptoAddress: String)