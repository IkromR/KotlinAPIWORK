package com.radzhabov.kotlin.Model

data class Counties(
    val counties: List<County>
)

data class County(
    val code: String,
    val code3: String,
    val name: String
)