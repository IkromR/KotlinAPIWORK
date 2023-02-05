package com.radzhabov.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.radzhabov.kotlin.Model.Stations

class MainActivity : AppCompatActivity() {
    lateinit var mStations: Stations

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print(mStations)
    }
}