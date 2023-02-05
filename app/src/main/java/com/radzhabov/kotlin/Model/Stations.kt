package com.radzhabov.kotlin.Model

data class Stations(
    val Stations: List<Station>
)

data class Station(
    val city: String,
    val codes: Codes,
    val direction: String,
    val station_type: String,
    val title: String,
    val transport_type: String
)

data class Codes(
    val yandex_code: String
)
