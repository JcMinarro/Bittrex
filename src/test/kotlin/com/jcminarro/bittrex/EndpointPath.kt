package com.jcminarro.bittrex

import com.github.tomakehurst.wiremock.client.WireMock



object EndpointPath {
    val GET_MARKETS = WireMock.urlPathMatching("/public/getmarkets")
    val GET_CURRENCIES = WireMock.urlPathMatching("/public/getcurrencies")
    val GET_TICK = WireMock.urlPathMatching("/public/getticker")
    val GET_MARKET_SUMMARIES = WireMock.urlPathMatching("/public/getmarketsummaries")
    val GET_MARKET_SUMMARY = WireMock.urlPathMatching("/public/getmarketsummary")
    val GET_ORDERBOOK = WireMock.urlPathMatching("/public/getorderbook")
    val GET_MARKET_HISOTRY = WireMock.urlPathMatching("/public/getmarkethistory")

    val GET_BALANCES = WireMock.urlPathMatching("/account/getbalances")
    val GET_BALANCE = WireMock.urlPathMatching("/account/getbalance")
    val WITHDRAW = WireMock.urlPathMatching("/account/withdraw")
    val GET_DEPOSIT_ADDRESS = WireMock.urlPathMatching("/account/getdepositaddress")
    val GET_ORDER = WireMock.urlPathMatching("/account/getorder")
    val GET_ORDER_HISTORY = WireMock.urlPathMatching("/account/getorderhistory")
    val GET_WITHDRAWAL_HISTORY = WireMock.urlPathMatching("/account/getwithdrawalhistory")
    val GET_DEPOSIT_HISTORY = WireMock.urlPathMatching("/account/getdeposithistory")
}