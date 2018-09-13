package com.my.myproduct

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.my.myproduct.databinding.ActivityMainBinding
import com.my.myproduct.util.Products

class MainActivity : AppCompatActivity() {

    lateinit  var mBinding : ActivityMainBinding

   // lateinit  var mProduct: Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        var products = Products()
        mBinding.product = products.PRODUCTS[0]
    }
}
