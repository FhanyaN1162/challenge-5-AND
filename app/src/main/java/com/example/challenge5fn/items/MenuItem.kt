package com.example.challenge5fn.items

data class MenuItem(
    val name: String,
    val price: Int,
    val description: String,
    val imageRes: Int,
    val restaurantAddress: String,
    val googleMapsUrl: String = ""
)