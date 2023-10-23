package com.example.challenge5fn.model


import com.google.gson.annotations.SerializedName

data class ListMenu(
    @SerializedName("data")
    val data: List<ListMenuData>,
    @SerializedName("message")
    val message: String?,
    @SerializedName("status")
    val status: Boolean?
)