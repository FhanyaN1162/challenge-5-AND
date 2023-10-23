package com.example.challenge5fn.model

data class OrderRequest(
    val orders: List<Order>,
    val total: Int?,
    val username: String?
)
