package com.radzhabov.kotlin

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader


class ResourceHelperAirlines {

    companion object {
        fun getJsonDataFromAssetAirlines(resourcePath: String): String {
            val result = StringBuilder()

            try {
                val input  = ResourceHelperAirlines::class.java.getResourceAsStream(resourcePath) as InputStream
                if (input != null) {
                    val reader = BufferedReader(InputStreamReader(input))
                    var string: String? = reader.readLine()

                    while (reader != null && string != null) {
                        result.append(string)
                        string = reader.readLine()
                    }
                }
            } catch (e: IOException) {
                e.printStackTrace()

            }

            return result.toString()
        }
    }
}