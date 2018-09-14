package com.my.myproduct.util


object StringUtil {


        @JvmStatic
        fun getQuantityString(quantity: Int): String {
            return "Qty: " + quantity.toString()
        }

        @JvmStatic
        fun convertIntToString(value: Int): String {
            return "(" + value.toString() + ")"
        }


}









