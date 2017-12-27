package com.jcminarro.bittrex.api.publicapi

import com.jcminarro.bittrex.*
import com.jcminarro.bittrex.api.*

internal class PublicAPI(bittrexCredentials: BittrexCredentials)
    : APIClient<PublicAPIEndpoint>(bittrexCredentials, PublicAPIEndpoint::class.java) {

    @Throws(BittrexException::class)
    fun getMarkets() = evaluateCall { endpoint.getMarkets() }.map { it.toModel() }

    @Throws(BittrexException::class)
    fun getCurrencies() = evaluateCall { endpoint.getCurrencies() }.map { it.toModel() }

    @Throws(BittrexException::class)
    fun getTick(market: String) = evaluateCall { endpoint.getTick(market) }.toModel()

    @Throws(BittrexException::class)
    fun getMarketSummaries() = evaluateCall { endpoint.getMarketSummaries() }.map { it.toModel() }

    @Throws(BittrexException::class)
    fun getMarketSummary(market: String) = evaluateCall { endpoint.getMarketSummary(market) }[0].toModel()

    @Throws(BittrexException::class)
    fun getOrderbook(market: String, orderType: Array<OrderType>) =
            evaluateCall {
                endpoint.getOrderBook(market,
                        orderType.map { it.toQueryParam() }
                                .takeIf { it.isNotEmpty() }
                                ?.reduce { a, b -> a.merge(b) }
                                ?: OrderTypeQueryParam.BOTH)
            }.toModel()

    @Throws(BittrexException::class)
    fun getMarketHistory(market: String): MarketHistory =
            evaluateCall { endpoint.getMarketHistory(market) }.mapNotNull { it.toModel() }
}

private fun OrderType.toQueryParam() = when (this) {
    OrderType.BUY -> OrderTypeQueryParam.BUY
    OrderType.SELL -> OrderTypeQueryParam.SELL
}

private fun OrderTypeQueryParam.merge(o: OrderTypeQueryParam) = if (this == o) this else OrderTypeQueryParam.BOTH

private fun TradeResponse.toModel() =
        mapFillType(fillType)
                ?.let { fillType ->
                    mapOrderType(orderType)
                            ?.let { orderType ->
                                Trade(id,
                                        timestamp,
                                        quantity,
                                        price,
                                        total,
                                        fillType,
                                        orderType)
                            }
                }

fun mapFillType(fillType: String) = when (fillType.toLowerCase()) {
    "fill" -> FillType.FILL
    "partial_fill" -> FillType.PARTIAL_FILL
    else -> null
}

fun mapOrderType(orderType: String) = when (orderType.toLowerCase()) {
    "buy" -> OrderType.BUY
    "sell" -> OrderType.SELL
    else -> null
}

private fun OrderbookResponse.toModel() =
        Orderbook(buy.map { it.toModel() }, sell.map { it.toModel() })

private fun OrderResponse.toModel() = Order(quantity, rate)

private fun TickResponse.toModel() = Tick(bid, ask, last)

private fun MarketSummaryResponse.toModel() =
        MarketSummary(marketName,
                high,
                low,
                volume,
                last,
                baseVolume,
                bid,
                ask,
                prevDay,
                openBuyOrders,
                openSellOrders,
                timestamp,
                created)

private fun MarketResponse.toModel() =
        Market(marketCurrency,
                marketCurrencyLong,
                baseCurrency,
                baseCurrencyLong,
                marketName,
                minTradeSize,
                isActive,
                created)

private fun CurrencyResponse.toModel() =
        Currency(currencyLong,
                currency,
                minConfirmation,
                txFee,
                isActive,
                coinType)