package com.radzhabov.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.radzhabov.kotlin.Common.Common
import com.radzhabov.kotlin.Data.Stations
import retrofit2.Callback


class MainActivity : AppCompatActivity() {
    lateinit var mService: RetrofitServices

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mService = Common.retrofitService
    }

    private fun getAllStationsList(){
        mService.getStationsList().enqueue(object : Callback<MutableList<Stations>>{})
    }
}