package com.radzhabov.kotlin

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.radzhabov.kotlin.Model.Stations

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jsonFileString = ResourceHelper.getJsonDataFromAsset("/stations.json")

        val gson = Gson()
        val listStationsType = object : TypeToken<Stations>() {}.type

        val stations: Stations = gson.fromJson(jsonFileString, listStationsType)
    }
}
