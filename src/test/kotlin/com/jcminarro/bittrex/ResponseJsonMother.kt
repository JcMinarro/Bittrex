package com.jcminarro.bittrex

import com.jcminarro.bittrex.api.*
import java.text.SimpleDateFormat
import java.util.*

internal fun createMarketsResponseJson(marketResponseList: List<MarketResponse> = listOf(createMarketResponse())) =
        createGenericResponseJson(
                "[ ${marketResponseList.joinToString(separator = ",") { createMarketResponseJson(it) }}]")

private fun createMarketResponseJson(marketResponse: MarketResponse) =
        """
        {
            "MarketCurrency" : "${marketResponse.marketCurrency}",
			"BaseCurrency" : "${marketResponse.baseCurrency}",
			"MarketCurrencyLong" : "${marketResponse.marketCurrencyLong}",
			"BaseCurrencyLong" : "${marketResponse.baseCurrencyLong}",
			"MinTradeSize" : ${marketResponse.minTradeSize},
			"MarketName" : "${marketResponse.marketName}",
			"IsActive" : ${marketResponse.isActive},
			"Created" : "${marketResponse.created.format()}"
		}
        """.trimIndent()

internal fun createCurrenciesResponseJson(
        currencyResponseList: List<CurrencyResponse> = listOf(createCurrencyResponse())) =
        createGenericResponseJson(
                "[ ${currencyResponseList.joinToString(separator = ",") { createCurrencyResponseJson(it) }}]")

private fun createCurrencyResponseJson(currencyResponse: CurrencyResponse): String =
        """
        {
			"Currency" : "${currencyResponse.currency}",
			"CurrencyLong" : "${currencyResponse.currencyLong}",
			"MinConfirmation" : ${currencyResponse.minConfirmation},
			"TxFee" : ${currencyResponse.txFee},
			"IsActive" : ${currencyResponse.isActive},
			"CoinType" : "${currencyResponse.coinType}",
			"BaseAddress" : "${currencyResponse.baseAddress}"
		}
        """.trimIndent()

internal fun createTickResponseJson(tickResponse: TickResponse = createTickResponse()) =
        createGenericResponseJson(
                """
                {
                    "Bid" : ${tickResponse.bid},
                    "Ask" : ${tickResponse.ask},
                    "Last" : ${tickResponse.last}
                }
                """.trimIndent())

internal fun createMarketSummariesResponseJson(
        marketSummaryResponseList: List<MarketSummaryResponse> = listOf(createMarketSummaryResponse())) =
        createGenericResponseJson(
                "[ ${marketSummaryResponseList
                        .joinToString(separator = ",") { createMarketSummaryResponseJson(it) }} ]")

private fun createMarketSummaryResponseJson(marketSummaryResponse: MarketSummaryResponse): String =
        """
        {
			"MarketName" : "${marketSummaryResponse.marketName}",
			"High" : ${marketSummaryResponse.high},
			"Low" : ${marketSummaryResponse.low},
			"Volume" : ${marketSummaryResponse.volume},
			"Last" : ${marketSummaryResponse.last},
			"BaseVolume" : ${marketSummaryResponse.baseVolume},
			"TimeStamp" : "${marketSummaryResponse.timestamp.format()}",
			"Bid" : ${marketSummaryResponse.bid},
			"Ask" : ${marketSummaryResponse.ask},
			"OpenBuyOrders" : ${marketSummaryResponse.openBuyOrders},
			"OpenSellOrders" : ${marketSummaryResponse.openSellOrders},
			"PrevDay" : ${marketSummaryResponse.prevDay},
			"Created" : "${marketSummaryResponse.created.format()}"
		}
        """.trimIndent()

internal fun createOrderbookResponseJson(orderbookResponse: OrderbookResponse =
                                         createOrderbookResponse(
                                                 listOf(createOrderbookEntryResponse()),
                                                 listOf(createOrderbookEntryResponse()))) =
        createGenericResponseJson(
                """
                {
                    "Buy" : [ ${orderbookResponse.buy.joinToString(",") { createOrderbookEntryResponseJson(it) }}],
                    "Sell" : [ ${orderbookResponse.sell.joinToString(",") { createOrderbookEntryResponseJson(it) }} ]
                }
                """.trimIndent())

private fun createOrderbookEntryResponseJson(orderbookEntryResponse: OrderbookEntryResponse) =
        """
        {
            "Quantity" : ${orderbookEntryResponse.quantity},
            "Rate" : ${orderbookEntryResponse.rate}
		}
        """.trimIndent()

internal fun createMarketHistoryResponseJson(
        marketHistoryResponse: List<TradeResponse> = listOf(createTradeResponse())) =
        createGenericResponseJson(
                "[ ${marketHistoryResponse.joinToString(",") { createTradeResponseJson(it) }} ]")

private fun createTradeResponseJson(tradeResponse: TradeResponse) =
        """
        {
			"Id" : ${tradeResponse.id},
			"TimeStamp" : "${tradeResponse.timestamp.format()}",
			"Quantity" : ${tradeResponse.quantity},
			"Price" : ${tradeResponse.price},
			"Total" : ${tradeResponse.total},
			"FillType" : "${tradeResponse.fillType}",
			"OrderType" : "${tradeResponse.orderType}"
		}
        """.trimIndent()

private fun createGenericResponseJson(result: String) =
        """
        {
             "success" : true,
             "message" : "",
             "result" : $result
        }
        """.trimIndent()

internal fun createBalanceResponseJson(balance: BalanceResponse = createBalanceResponse()) =
        createGenericResponseJson(createBalanceResponseContentJson(balance))

internal fun createBalanceHistoryResponseJson(balances: List<BalanceResponse> = listOf(createBalanceResponse())) =
        createGenericResponseJson(
                "[ ${balances.joinToString(", ") { createBalanceResponseContentJson(it) }} ]")

private fun createBalanceResponseContentJson(balance: BalanceResponse): String =
        """
        {
            "Currency":"${balance.currency}",
            "Balance": ${balance.balance},
            "Available":${balance.available},
            "Pending":${balance.pending},
            "CryptoAddress":"${balance.cryptoAddress}",
            "Requested":${balance.requested},
            "Uuid":"${balance.uuid}"
        }
        """.trimIndent()

internal fun createDepositAddressResponseJson(
        depositAddressResponse: DepositAddressResponse = createDepositAddressResponse()) =
        createGenericResponseJson(
                """
                {
                    "Currency":"${depositAddressResponse.currency}",
                    "Address":"${depositAddressResponse.address}"
                }
                """.trimIndent()
        )

internal fun createWithdrawalRequestedResponseJson(
        withdrawalRequestedResponse: WithdrawalRequestedResponse = createWithdrawalRequestedResponse()) =
        createGenericResponseJson("{\"uuid\": \"${withdrawalRequestedResponse.uuid}\"}")

internal fun createOrderResponseJson(orderResponse: OrderResponse = createOrderResponse()) =
        createGenericResponseJson(createOrderResponseContentJson(orderResponse))

internal fun createOrderHistoryResponseJson(orderHistoryResopnse: List<OrderResponse> = listOf(createOrderResponse())) =
        createGenericResponseJson(
                "[ ${orderHistoryResopnse.joinToString(", ") { createOrderResponseContentJson(it) }} ]")

internal fun createWithdrawalHistoryResponseJson(
        withdrawalHistoryResponse: List<WithdrawalResponse> = listOf(createWithdrawalResponse())) =
        createGenericResponseJson(
                "[ ${withdrawalHistoryResponse.joinToString(",") { createWithdrawalResponseJson(it) }} ]")

internal fun createDepositHistoryResponseJson(
        depositHistoryResponse: List<DepositResponse> = listOf(createDepositResponse())) =
        createGenericResponseJson(
                "[ ${depositHistoryResponse.joinToString(",") { createDepositResponseJson(it) }} ]")

private fun createDepositResponseJson(depositResponse: DepositResponse) =
        """
        {
            "Id": ${depositResponse.id},
            "Amount": ${depositResponse.amount},
            "Currency": "${depositResponse.currency}",
            "Confirmations": ${depositResponse.confirmations},
            "LastUpdated": "${depositResponse.lastUpdated.format()}",
            "TxId": "${depositResponse.txId}",
            "CryptoAddress": "${depositResponse.cryptoAddress}"
        }
        """.trimIndent()

private fun createWithdrawalResponseJson(withdrawalResponse: WithdrawalResponse) =
        """
        {
            "PaymentUuid":"${withdrawalResponse.paymentUuid}",
            "Currency":"${withdrawalResponse.currency}",
            "Amount":${withdrawalResponse.amount},
            "Address":"${withdrawalResponse.address}",
            "Opened":"${withdrawalResponse.opened.format()}",
            "Authorized":${withdrawalResponse.authorized},
            "PendingPayment":${withdrawalResponse.pendingPayment},
            "TxCost":${withdrawalResponse.txCost},
            "TxId":"${withdrawalResponse.txId}",
            "Canceled":${withdrawalResponse.canceled},
            "InvalidAddress":${withdrawalResponse.invalidAddress}
        }
        """.trimIndent()

private fun createOrderResponseContentJson(orderResponse: OrderResponse) =
        """
        {
            "OrderUuid": "${orderResponse.orderUuid}",
            "Exchange": "${orderResponse.exchange}",
            "TimeStamp": "${orderResponse.opened?.format()}",
            "OrderType": "${orderResponse.orderType}",
            "Limit": ${orderResponse.limit},
            "Quantity": ${orderResponse.quantity},
            "QuantityRemaining": ${orderResponse.quantityRemaining},
            "Commission": ${orderResponse.commissionPaid},
            "Price": ${orderResponse.price},
            "PricePerUnit": ${orderResponse.pricePerUnit},
            "IsConditional": ${orderResponse.isConditional},
            "Condition": "${orderResponse.condition}",
            "ConditionTarget": ${orderResponse.conditionTarget},
            "ImmediateOrCancel": ${orderResponse.immediateOrCancel},
            "Closed": "${orderResponse.closed?.format()}"
        }
        """.trimIndent()

private fun Date.format(pattern: String = "yyyy-MM-dd'T'HH:mm:ss"): String = SimpleDateFormat(pattern).format(this)

