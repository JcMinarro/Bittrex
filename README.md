# Bittrex

[![CircleCI](https://circleci.com/gh/JcMinarro/Bittrex/tree/master.svg?style=svg)](https://circleci.com/gh/JcMinarro/Bittrex/tree/master)


Kotlin client for accessing the Bittrex API.
It uses the API Version v1.1
API Spec: https://bittrex.com/home/api

Where can I get the latest release?
-----------------------------------
Bittrex is not published yet. I will update that section when the library is uploaded to jCenter

## Examples
Show some examples here (Kotlin & Java)

## Implementation Status

### Public Api
- [X] /public/getmarkets
- [X] /public/getcurrencies
- [X] /public/getticker
- [X] /public/getmarketsummaries
- [X] /public/getmarketsummary
- [X] /public/getorderbook
- [X] /public/getmarkethistory

### Market Api (Credentials required)
- [] /market/buylimit 
- [] /market/selllimit
- [] /market/cancel
- [] /market/getopenorders

### Account Api (Credentials required)
- [X] /account/getbalances
- [X] /account/getbalance
- [X] /account/getdepositaddress
- [X] /account/withdraw
- [X] /account/getorder
- [X] /account/getorderhistory
- [X] /account/getwithdrawalhistory 
- [X] /account/getdeposithistory

## Do you like this library?
### Donate Bitcoin to [1NarDCZ8XAgYcmaPpuJ55qayM6ECkwSm2G](https://live.blockcypher.com/btc/address/1NarDCZ8XAgYcmaPpuJ55qayM6ECkwSm2G/)
### Donate Bitcoin Cash to [1165bey4uNWqjHjUUZLNpiynf9th3cmK8q](https://blockdozer.com/insight/address/1165bey4uNWqjHjUUZLNpiynf9th3cmK8q)
### Donate Litecoin to [LRmyPhiQQAy2BxvW5LRkKn2oMh1MYCanSd](https://live.blockcypher.com/ltc/address/LRmyPhiQQAy2BxvW5LRkKn2oMh1MYCanSd/)
### Donate Ether to [0xA584c82855E9D32b54b047bf2c2b1192B680f72F](https://etherscan.io/address/0xA584c82855E9D32b54b047bf2c2b1192B680f72F)

License
-------


    Copyright 2017 Jc Miñarro

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.