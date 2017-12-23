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

internal data class OrderResponse(
        @SerializedName("Quantity") val quantity: Double,
        @SerializedName("Rate") val rate: Double)

internal data class OrderbookResponse(
        @SerializedName("Buy") val buy: List<OrderResponse>,
        @SerializedName("Sell") val sell: List<OrderResponse>)

internal data class TradeResponse(
        @SerializedName("Id") val id: Int,
        @SerializedName("TimeStamp") val timestamp: Date,
        @SerializedName("Quantity") val quantity: Double,
        @SerializedName("Price") val price: Double,
        @SerializedName("Total") val total: Double,
        @SerializedName("FillType") val fillType: String,
        @SerializedName("OrderType") val orderType: String)
