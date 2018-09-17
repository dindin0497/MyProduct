package com.my.myproduct

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

object GlideBindingAdapter{
    @BindingAdapter("imageUrl")
    @JvmStatic
    fun setImage(view: ImageView, imgUrl: Int)
    {
        var option = RequestOptions().placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background)
        Glide.with(view.context)
                .setDefaultRequestOptions(option)
                .load(imgUrl).into(view)
    }

    @BindingAdapter("imageUrl")
    @JvmStatic
    fun setImage(view: ImageView, imgUrl: String)
    {
        var option = RequestOptions().placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background)
        Glide.with(view.context)
                .setDefaultRequestOptions(option)
                .load(imgUrl).into(view)
    }
}