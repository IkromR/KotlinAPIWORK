package com.radzhabov.kotlin

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.radzhabov.kotlin.Model.Stations
import com.radzhabov.kotlin.Model.Airlines

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Stations handlers
        val jsonFileStringStations = ResourceHelperStations.getJsonDataFromAssetStations("/stations.json")
        val gsonStations = Gson()
        val listStationsType = object : TypeToken<Stations>() {}.type
        val stations: Stations = gsonStations.fromJson(jsonFileStringStations, listStationsType)

        // Airlines handlers
        val jsonFileStringAirlines = ResourceHelperAirlines.getJsonDataFromAssetAirlines("/airlines.json")
        val gsonAirlines = Gson()
        val listAirlinesType = object : TypeToken<Airlines>() {}.type
        val airlines: Airlines = gsonAirlines.fromJson(jsonFileStringAirlines, listAirlinesType)

    }
}
