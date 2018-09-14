package com.my.myproduct.util

import java.math.BigDecimal
import java.text.DecimalFormat


object BigDecimalUtil {

    @JvmStatic
    fun getValue(value: BigDecimal): String {
        val df = DecimalFormat("###,###,###.00")
        return df.format(value).toString()
    }

    /*
        For rating bar (actual rating)
     */
    @JvmStatic
    fun getFloat(value: BigDecimal): Float {
        return value.toFloat()
    }


}
