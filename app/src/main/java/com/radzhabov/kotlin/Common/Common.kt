package com.radzhabov.kotlin.Common

import com.radzhabov.kotlin.Retrofit.RetrofitClient
import com.radzhabov.kotlin.RetrofitServices

object Common {
    private val BASE_URL = "https://api.rasp.yandex.net/v3.0/stations_list/?apikey=5ed2d71a-8b0e-46dd-bd83-02c1b3d30a54"
    val retrofitService: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)

}