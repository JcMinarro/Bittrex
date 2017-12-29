package com.jcminarro.bittrex.api.accountapi

import com.jcminarro.bittrex.*
import com.jcminarro.bittrex.api.*
import java.util.*

internal class AccountAPI(bittrexCredentials: BittrexCredentials)
    : APIClient<AccountAPIEndpoint>(bittrexCredentials, AccountAPIEndpoint::class.java) {

    @Throws(BittrexException::class)
    fun getBalances(): BalanceHistory = evaluateCall { endpoint.getBalances() }.map { it.toModel() }

    @Throws(BittrexException::class)
    fun getBalance(currency: String) = evaluateCall { endpoint.getBalance(currency) }.toModel()

    @Throws(BittrexException::class)
    fun getOrder(uuid: String) = evaluateCall { endpoint.getOrder(uuid) }.toModel() ?: throw MalformedOrderException()

    @Throws(BittrexException::class)
    fun getOrderHistory(market: String? = null): OrderHistory =
            evaluateCall { endpoint.getOrderHistory(market) }
                    .mapNotNull { it.toModel() }

    @Throws(BittrexException::class)
    fun getDepositAddress(currency: String) =
            evaluateCall { endpoint.getDepositAddress(currency) }.toModel()

    @Throws(BittrexException::class)
    fun getWithdrawalHistotry(currency: String? = null): WithdrawalHistory =
            evaluateCall { endpoint.getWithdrawalHisotry(currency) }
                    .map { it.toModel() }

    @Throws(BittrexException::class)
    fun getDepositHistory(currency: String? = null): DepositHistory =
            evaluateCall { endpoint.getDepositHisotry(currency) }
                    .map { it.toModel() }

    @Throws(BittrexException::class)
    fun withdraw(currency: String, quantity: Double, address: String, paymentId: String? = null): WithdrawalRequested =
            evaluateCall {
                endpoint.withdraw(currency, quantity, address, paymentId)
            }.toModel()
}

fun mapOrderType(orderType: String) = when (orderType.toLowerCase()) {
    "limit_buy" -> OrderType.BUY
    "limit_sell" -> OrderType.SELL
    else -> null
}

private fun BalanceResponse.toModel() =
        Balance(currency,
                balance,
                available,
                pending,
                cryptoAddress ?: "",
                requested ?: false,
                uuid ?: "")

private fun OrderResponse.toModel() =
        mapOrderType(orderType)
                ?.let { orderType ->
                    Order(
                            orderUuid,
                            exchange,
                            orderType,
                            quantity,
                            quantityRemaining,
                            limit,
                            commissionPaid,
                            price,
                            pricePerUnit,
                            opened ?: Date(0),
                            closed ?: Date(0),
                            cancelInitiated,
                            immediateOrCancel,
                            condition?.isNotBlank() ?: false && isConditional,
                            condition ?: "",
                            conditionTarget ?: "")
                }

private fun DepositAddressResponse.toModel() = DepositAddress(currency, address)

private fun WithdrawalResponse.toModel() =
        Withdrawal(paymentUuid,
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

private fun DepositResponse.toModel() =
        Deposit(id,
                amount,
                currency,
                confirmations,
                lastUpdated,
                txId,
                cryptoAddress)

private fun WithdrawalRequestedResponse.toModel() = WithdrawalRequested(uuid)