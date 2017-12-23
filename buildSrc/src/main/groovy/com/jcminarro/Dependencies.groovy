package com.jcminarro

class Dependencies {

    private static String KOTLIN_VERSION = '1.2.0'
    private static String JUNIT_VERSION = '4.12'
    private static String RETROFIT_VERSION = '2.1.0'
    private static String OK_HTTP_VERSION = '3.5.0'
    private static String OK2CURL_VERSION = '0.3.2'
    private static String MOKITO_VERSION = '2.9.0'
    private static String KLUENT_VERSION = '1.28'
    private static String MOKITO_KOTLIN_VERSION = '1.5.0'
    private static String WIREMOCK_VERSION = '2.8.0'

    static String kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION"
    static String kotlinSTDLib = "org.jetbrains.kotlin:kotlin-stdlib-jre7:$KOTLIN_VERSION"
    static String retrofit = "com.squareup.retrofit2:retrofit:$RETROFIT_VERSION"
    static String retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:$RETROFIT_VERSION"
    static String okHttpLogger = "com.squareup.okhttp3:logging-interceptor:$OK_HTTP_VERSION"
    static String ok2curl = "com.github.mrmike:Ok2Curl:$OK2CURL_VERSION"

    static String jUnit = "junit:junit:$JUNIT_VERSION"
    static String mockito = "org.mockito:mockito-core:$MOKITO_VERSION"
    static String kotlinTestJunit = "org.jetbrains.kotlin:kotlin-test-junit:$KOTLIN_VERSION"
    static String kluent = "org.amshove.kluent:kluent:$KLUENT_VERSION"
    static String mockitoKotlin = "com.nhaarman:mockito-kotlin:$MOKITO_KOTLIN_VERSION"
    static String wiremock = "com.github.tomakehurst:wiremock:$WIREMOCK_VERSION"
}