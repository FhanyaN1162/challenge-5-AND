package com.example.challenge5fn.repository

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.challenge5fn.database.CartItemDao
import com.example.challenge5fn.items.CartItem

class CartRepository(private val cartItemDao: CartItemDao) {

    val allCartItems: LiveData<List<CartItem>> = cartItemDao.getAllCartItems()

    fun insertCartItem(cartItem: CartItem) {
        cartItemDao.insertCartItem(cartItem)
    }

    fun deleteCartItem(cartItem: CartItem) {
        cartItemDao.deleteCartItem(cartItem)
    }
    fun updateCartItem(cartItem: CartItem) {
        cartItemDao.updateCartItem(cartItem)
    }
    fun deleteAllCartItems() {
        cartItemDao.deleteAllCartItems()
    }
    fun getCartByFoodName(foodName:String):CartItem?{
        return cartItemDao.getCartItemByFoodName(foodName)
    }

}
