package com.radzhabov.kotlin

import retrofit2.Call
import com.radzhabov.kotlin.Data.Stations
import retrofit2.http.*

interface RetrofitServices {
    @GET("&lang=ru_RU")
    fun getStationsList(): Call<MutableList<Stations>>
}