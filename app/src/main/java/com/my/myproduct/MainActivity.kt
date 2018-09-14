package com.my.myproduct

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.my.myproduct.databinding.ActivityMainBinding
import com.my.myproduct.util.Products

class MainActivity : AppCompatActivity(), IMainActivity {

    lateinit  var mBinding : ActivityMainBinding

   // lateinit  var mProduct: Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        var products = Products()
        mBinding.product = products.PRODUCTS[0]

        mBinding.productNum = 125

        mBinding.iMainActivity = this
    }

    override fun inflateQuantityDialog() {
        var dialog = ChooseQuantityDialog()
        dialog.show(supportFragmentManager,getString(R.string.dialog_choose_quantity))
    }

    override fun setQuantity(n: Int) {
        mBinding.productNum = n
    }
}
