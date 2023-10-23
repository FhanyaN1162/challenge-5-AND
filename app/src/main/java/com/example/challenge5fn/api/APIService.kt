package com.example.challenge5fn.api

import com.example.challenge5fn.model.CategoryMenu
import com.example.challenge5fn.model.ListMenu
import com.example.challenge5fn.model.OrderRequest
import com.example.challenge5fn.model.OrderResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface APIService {
    @GET("listmenu")
    fun getListMenu(
    ): Call<ListMenu>

    @GET("category-menu")
    fun getCategoryMenu(
    ): Call<CategoryMenu>

    @POST("order-menu")
    fun order(
        @Body orderRequest: OrderRequest
    ): Call<OrderResponse>
}
