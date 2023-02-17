package com.radzhabov.kotlin

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.radzhabov.kotlin.Model.Airlines
import com.radzhabov.kotlin.Model.Airports
import com.radzhabov.kotlin.Model.Cities
import com.radzhabov.kotlin.Model.Counties
import com.radzhabov.kotlin.Resource.ResourceHelper


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gson = Gson()

        // Counties handlers
        val jsonFileStringCounties = ResourceHelper.getJsonDataFromAsset("/counties.json")
        val listCountiesType = object : TypeToken<Counties>() {}.type
        val counties: Counties = gson.fromJson(jsonFileStringCounties, listCountiesType)

        // Cities handlers
        val jsonFileStringCities = ResourceHelper.getJsonDataFromAsset("/cities.json")
        val listCitiesType = object : TypeToken<Cities>() {}.type
        val cities: Cities = gson.fromJson(jsonFileStringCities, listCitiesType)

        // Airlines handlers
        val jsonFileStringAirlines = ResourceHelper.getJsonDataFromAsset("/airlines.json")
        val listAirlinesType = object : TypeToken<Airlines>() {}.type
        val airlines: Airlines = gson.fromJson(jsonFileStringAirlines, listAirlinesType)

        // Airports handlers
        val jsonFileStringAirports = ResourceHelper.getJsonDataFromAsset("/airports.json")
        val listAirportsType = object : TypeToken<Airports>() {}.type
        val airports: Airports = gson.fromJson(jsonFileStringAirports, listAirportsType)
    }
}
