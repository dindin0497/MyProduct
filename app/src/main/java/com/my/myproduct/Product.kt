package com.my.myproduct

import android.os.Parcel
import java.math.BigDecimal


data class Product (var title: String, var description: String, var image: Int, var price: BigDecimal,
               var sale_price: BigDecimal, var num_ratings: Int, var rating: BigDecimal, var serial_number: Int){


    fun hasSalePrice(): Boolean {
        val salePrice = sale_price.toFloat()
        return if (salePrice > 0) {
            true
        } else {
            false
        }
    }

    fun getNumberRatingsString(): String {
        return "(" + num_ratings.toString() + ")"
    }




}