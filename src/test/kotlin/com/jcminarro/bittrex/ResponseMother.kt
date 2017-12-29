package com.jcminarro.bittrex

import com.jcminarro.bittrex.ResponseMother.BALANCE_RESPONSE_MOTHER_available
import com.jcminarro.bittrex.ResponseMother.BALANCE_RESPONSE_MOTHER_balance
import com.jcminarro.bittrex.ResponseMother.BALANCE_RESPONSE_MOTHER_cryptoAddress
import com.jcminarro.bittrex.ResponseMother.BALANCE_RESPONSE_MOTHER_currency
import com.jcminarro.bittrex.ResponseMother.BALANCE_RESPONSE_MOTHER_pending
import com.jcminarro.bittrex.ResponseMother.BALANCE_RESPONSE_MOTHER_requested
import com.jcminarro.bittrex.ResponseMother.BALANCE_RESPONSE_MOTHER_uuid
import com.jcminarro.bittrex.ResponseMother.CURRENCY_RESPONSE_MOTHER_baseAddress
import com.jcminarro.bittrex.ResponseMother.CURRENCY_RESPONSE_MOTHER_coinType
import com.jcminarro.bittrex.ResponseMother.CURRENCY_RESPONSE_MOTHER_currency
import com.jcminarro.bittrex.ResponseMother.CURRENCY_RESPONSE_MOTHER_currencyLong
import com.jcminarro.bittrex.ResponseMother.CURRENCY_RESPONSE_MOTHER_isActive
import com.jcminarro.bittrex.ResponseMother.CURRENCY_RESPONSE_MOTHER_minConfirmation
import com.jcminarro.bittrex.ResponseMother.CURRENCY_RESPONSE_MOTHER_txFee
import com.jcminarro.bittrex.ResponseMother.DEPOSIT_ADDRESS_RESPONSE_MOTHER_address
import com.jcminarro.bittrex.ResponseMother.DEPOSIT_ADDRESS_RESPONSE_MOTHER_currency
import com.jcminarro.bittrex.ResponseMother.DEPOSIT_RESPONSE_MOTHER_amount
import com.jcminarro.bittrex.ResponseMother.DEPOSIT_RESPONSE_MOTHER_confirmations
import com.jcminarro.bittrex.ResponseMother.DEPOSIT_RESPONSE_MOTHER_cryptoAddress
import com.jcminarro.bittrex.ResponseMother.DEPOSIT_RESPONSE_MOTHER_currency
import com.jcminarro.bittrex.ResponseMother.DEPOSIT_RESPONSE_MOTHER_id
import com.jcminarro.bittrex.ResponseMother.DEPOSIT_RESPONSE_MOTHER_lastUpdated
import com.jcminarro.bittrex.ResponseMother.DEPOSIT_RESPONSE_MOTHER_txId
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
import com.jcminarro.bittrex.ResponseMother.ORDER_RESPONSE_MOTHER_cancelInitiated
import com.jcminarro.bittrex.ResponseMother.ORDER_RESPONSE_MOTHER_closed
import com.jcminarro.bittrex.ResponseMother.ORDER_RESPONSE_MOTHER_commissionPaid
import com.jcminarro.bittrex.ResponseMother.ORDER_RESPONSE_MOTHER_condition
import com.jcminarro.bittrex.ResponseMother.ORDER_RESPONSE_MOTHER_conditionTarget
import com.jcminarro.bittrex.ResponseMother.ORDER_RESPONSE_MOTHER_exchange
import com.jcminarro.bittrex.ResponseMother.ORDER_RESPONSE_MOTHER_immediateOrCancel
import com.jcminarro.bittrex.ResponseMother.ORDER_RESPONSE_MOTHER_isConditional
import com.jcminarro.bittrex.ResponseMother.ORDER_RESPONSE_MOTHER_limit
import com.jcminarro.bittrex.ResponseMother.ORDER_RESPONSE_MOTHER_opened
import com.jcminarro.bittrex.ResponseMother.ORDER_RESPONSE_MOTHER_orderType
import com.jcminarro.bittrex.ResponseMother.ORDER_RESPONSE_MOTHER_orderUuid
import com.jcminarro.bittrex.ResponseMother.ORDER_RESPONSE_MOTHER_price
import com.jcminarro.bittrex.ResponseMother.ORDER_RESPONSE_MOTHER_pricePerUnit
import com.jcminarro.bittrex.ResponseMother.ORDER_RESPONSE_MOTHER_quantity
import com.jcminarro.bittrex.ResponseMother.ORDER_RESPONSE_MOTHER_quantityRemaining
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
import com.jcminarro.bittrex.ResponseMother.WITHDRAWAL_REQUESTED_RESPONSE_MOTHER_uuid
import com.jcminarro.bittrex.ResponseMother.WITHDRAWAL_RESPONSE_MOTHER_address
import com.jcminarro.bittrex.ResponseMother.WITHDRAWAL_RESPONSE_MOTHER_amount
import com.jcminarro.bittrex.ResponseMother.WITHDRAWAL_RESPONSE_MOTHER_authorized
import com.jcminarro.bittrex.ResponseMother.WITHDRAWAL_RESPONSE_MOTHER_canceled
import com.jcminarro.bittrex.ResponseMother.WITHDRAWAL_RESPONSE_MOTHER_currency
import com.jcminarro.bittrex.ResponseMother.WITHDRAWAL_RESPONSE_MOTHER_invalidAddress
import com.jcminarro.bittrex.ResponseMother.WITHDRAWAL_RESPONSE_MOTHER_opened
import com.jcminarro.bittrex.ResponseMother.WITHDRAWAL_RESPONSE_MOTHER_paymentUuid
import com.jcminarro.bittrex.ResponseMother.WITHDRAWAL_RESPONSE_MOTHER_pendingPayment
import com.jcminarro.bittrex.ResponseMother.WITHDRAWAL_RESPONSE_MOTHER_txCost
import com.jcminarro.bittrex.ResponseMother.WITHDRAWAL_RESPONSE_MOTHER_txId
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

    val BALANCE_RESPONSE_MOTHER_currency: String = "BTC"
    val BALANCE_RESPONSE_MOTHER_balance: Double = 0.30802438
    val BALANCE_RESPONSE_MOTHER_available: Double = 0.01263400
    val BALANCE_RESPONSE_MOTHER_pending: Double = 0.00389158
    val BALANCE_RESPONSE_MOTHER_cryptoAddress: String = "1p52lHoVR76PMDishab2YmRHsbekCdGquK"
    val BALANCE_RESPONSE_MOTHER_requested: Boolean = true
    val BALANCE_RESPONSE_MOTHER_uuid: String = "c9887575-b22b-4a78-9752-32c33de5c0f6"

    val DEPOSIT_ADDRESS_RESPONSE_MOTHER_currency: String = "BTC"
    val DEPOSIT_ADDRESS_RESPONSE_MOTHER_address: String = "1p52lHoVR76PMDishab2YmRHsbekCdGquK"

    val WITHDRAWAL_REQUESTED_RESPONSE_MOTHER_uuid: String = "c9887575-b22b-4a78-9752-32c33de5c0f6"

    val ORDER_RESPONSE_MOTHER_orderUuid: String = "c9887575-b22b-4a78-9752-32c33de5c0f6"
    val ORDER_RESPONSE_MOTHER_exchange: String = "BTC-ETH"
    val ORDER_RESPONSE_MOTHER_orderType: String = "LIMIT_BUY"
    val ORDER_RESPONSE_MOTHER_quantity: Double = 0.30802438
    val ORDER_RESPONSE_MOTHER_quantityRemaining: Double = 0.01263400
    val ORDER_RESPONSE_MOTHER_limit: Double = 0.00389158
    val ORDER_RESPONSE_MOTHER_commissionPaid: Double = 0.000003
    val ORDER_RESPONSE_MOTHER_price: Double = 0.30802438
    val ORDER_RESPONSE_MOTHER_pricePerUnit: Double = 0.03080243
    val ORDER_RESPONSE_MOTHER_opened: Date = DEFAULT_DATE
    val ORDER_RESPONSE_MOTHER_closed: Date = DEFAULT_DATE
    val ORDER_RESPONSE_MOTHER_cancelInitiated: Boolean = false
    val ORDER_RESPONSE_MOTHER_immediateOrCancel: Boolean = false
    val ORDER_RESPONSE_MOTHER_isConditional: Boolean = false
    val ORDER_RESPONSE_MOTHER_condition: String = "NONE"
    val ORDER_RESPONSE_MOTHER_conditionTarget: String? = null

    val WITHDRAWAL_RESPONSE_MOTHER_paymentUuid: String = "c9887575-b22b-4a78-9752-32c33de5c0f6"
    val WITHDRAWAL_RESPONSE_MOTHER_currency: String = "BTC"
    val WITHDRAWAL_RESPONSE_MOTHER_amount: Double = 0.30802438
    val WITHDRAWAL_RESPONSE_MOTHER_address: String = "1p52lHoVR76PMDishab2YmRHsbekCdGquK"
    val WITHDRAWAL_RESPONSE_MOTHER_opened: Date = DEFAULT_DATE
    val WITHDRAWAL_RESPONSE_MOTHER_authorized: Boolean = true
    val WITHDRAWAL_RESPONSE_MOTHER_pendingPayment: Boolean = false
    val WITHDRAWAL_RESPONSE_MOTHER_txCost: Double = 0.001
    val WITHDRAWAL_RESPONSE_MOTHER_txId: String = "txId"
    val WITHDRAWAL_RESPONSE_MOTHER_canceled: Boolean = false
    val WITHDRAWAL_RESPONSE_MOTHER_invalidAddress: Boolean = false

    val DEPOSIT_RESPONSE_MOTHER_id: Int = 1234586
    val DEPOSIT_RESPONSE_MOTHER_amount: Double = 0.30802438
    val DEPOSIT_RESPONSE_MOTHER_currency: String = "BTC"
    val DEPOSIT_RESPONSE_MOTHER_confirmations: Int = 7
    val DEPOSIT_RESPONSE_MOTHER_lastUpdated: Date = DEFAULT_DATE
    val DEPOSIT_RESPONSE_MOTHER_txId: String = "txId"
    val DEPOSIT_RESPONSE_MOTHER_cryptoAddress: String = "1p52lHoVR76PMDishab2YmRHsbekCdGquK"
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

internal fun createOrderbookEntryResponse(quantity: Double = ORDER_RESPONSE_quantity,
                                          rate: Double = ORDER_RESPONSE_rate) =
        OrderbookEntryResponse(quantity, rate)

internal fun createOrderbookResponse(buy: List<OrderbookEntryResponse> = listOf(),
                                     sell: List<OrderbookEntryResponse> = listOf()) =
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

internal fun createBalanceResponse(
        currency: String = BALANCE_RESPONSE_MOTHER_currency,
        balance: Double = BALANCE_RESPONSE_MOTHER_balance,
        available: Double = BALANCE_RESPONSE_MOTHER_available,
        pending: Double = BALANCE_RESPONSE_MOTHER_pending,
        cryptoAddress: String? = BALANCE_RESPONSE_MOTHER_cryptoAddress,
        requested: Boolean? = BALANCE_RESPONSE_MOTHER_requested,
        uuid: String? = BALANCE_RESPONSE_MOTHER_uuid) =
        BalanceResponse(currency,
                balance,
                available,
                pending,
                cryptoAddress,
                requested,
                uuid)

internal fun createDepositAddressResponse(
        currency: String = DEPOSIT_ADDRESS_RESPONSE_MOTHER_currency,
        address: String = DEPOSIT_ADDRESS_RESPONSE_MOTHER_address) =
        DepositAddressResponse(currency, address)

internal fun createWithdrawalRequestedResponse(uuid: String = WITHDRAWAL_REQUESTED_RESPONSE_MOTHER_uuid) =
        WithdrawalRequestedResponse(uuid)

internal fun createOrderResponse(
        orderUuid: String = ORDER_RESPONSE_MOTHER_orderUuid,
        exchange: String = ORDER_RESPONSE_MOTHER_exchange,
        orderType: String = ORDER_RESPONSE_MOTHER_orderType,
        quantity: Double = ORDER_RESPONSE_MOTHER_quantity,
        quantityRemaining: Double = ORDER_RESPONSE_MOTHER_quantityRemaining,
        limit: Double = ORDER_RESPONSE_MOTHER_limit,
        commissionPaid: Double = ORDER_RESPONSE_MOTHER_commissionPaid,
        price: Double = ORDER_RESPONSE_MOTHER_price,
        pricePerUnit: Double = ORDER_RESPONSE_MOTHER_pricePerUnit,
        opened: Date? = ORDER_RESPONSE_MOTHER_opened,
        closed: Date? = ORDER_RESPONSE_MOTHER_closed,
        cancelInitiated: Boolean = ORDER_RESPONSE_MOTHER_cancelInitiated,
        immediateOrCancel: Boolean = ORDER_RESPONSE_MOTHER_immediateOrCancel,
        isConditional: Boolean = ORDER_RESPONSE_MOTHER_isConditional,
        condition: String? = ORDER_RESPONSE_MOTHER_condition,
        conditionTarget: String? = ORDER_RESPONSE_MOTHER_conditionTarget) =
        OrderResponse(orderUuid,
                exchange,
                orderType,
                quantity,
                quantityRemaining,
                limit,
                commissionPaid,
                price,
                pricePerUnit,
                opened,
                closed,
                cancelInitiated,
                immediateOrCancel,
                isConditional,
                condition,
                conditionTarget)

internal fun createWithdrawalResponse(
        paymentUuid: String = WITHDRAWAL_RESPONSE_MOTHER_paymentUuid,
        currency: String = WITHDRAWAL_RESPONSE_MOTHER_currency,
        amount: Double = WITHDRAWAL_RESPONSE_MOTHER_amount,
        address: String = WITHDRAWAL_RESPONSE_MOTHER_address,
        opened: Date = WITHDRAWAL_RESPONSE_MOTHER_opened,
        authorized: Boolean = WITHDRAWAL_RESPONSE_MOTHER_authorized,
        pendingPayment: Boolean = WITHDRAWAL_RESPONSE_MOTHER_pendingPayment,
        txCost: Double = WITHDRAWAL_RESPONSE_MOTHER_txCost,
        txId: String = WITHDRAWAL_RESPONSE_MOTHER_txId,
        canceled: Boolean = WITHDRAWAL_RESPONSE_MOTHER_canceled,
        invalidAddress: Boolean = WITHDRAWAL_RESPONSE_MOTHER_invalidAddress) =
        WithdrawalResponse(paymentUuid,
                currency,
                amount,
                address,
                opened,
                authorized,
                pendingPayment,
                txCost,
                txId,
                canceled,
                invalidAddress)

internal fun createDepositResponse(
        id: Int = DEPOSIT_RESPONSE_MOTHER_id,
        amount: Double = DEPOSIT_RESPONSE_MOTHER_amount,
        currency: String = DEPOSIT_RESPONSE_MOTHER_currency,
        confirmations: Int = DEPOSIT_RESPONSE_MOTHER_confirmations,
        lastUpdated: Date = DEPOSIT_RESPONSE_MOTHER_lastUpdated,
        txId: String = DEPOSIT_RESPONSE_MOTHER_txId,
        cryptoAddress: String = DEPOSIT_RESPONSE_MOTHER_cryptoAddress) =
        DepositResponse(id,
                amount,
                currency,
                confirmations,
                lastUpdated,
                txId,
                cryptoAddress)