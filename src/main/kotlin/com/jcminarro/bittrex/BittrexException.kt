package com.jcminarro.bittrex

import java.io.IOException

sealed class BittrexException(message: String) : IOException(message)
class BittrexIOException(message: String) : BittrexException(message)
class BittrexAPIException(message: String) : BittrexException("Message from Bittrex server: $message")
class MalformedOrderException() : BittrexException("Malformed Order")
class IllegalBittrexCredentialsException(message: String) : BittrexException(message)
