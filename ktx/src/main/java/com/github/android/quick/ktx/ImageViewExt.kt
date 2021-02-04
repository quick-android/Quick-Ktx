package com.github.android.quick.ktx

import android.annotation.SuppressLint
import android.widget.ImageView
import com.bumptech.glide.Glide

var ImageView.url: String?
    get() {
        return ""
    }
    set(value) {
        if (!value.isNullOrEmpty()) {
            Glide.with(this.context).load(value).into(this)
        }
    }


@SuppressLint("CheckResult")
fun ImageView.load(url: String?, placeholder: Int = -1) {
    val requestBuilder = Glide.with(this.context).load(url)
    if (placeholder != -1) {
        requestBuilder.placeholder(placeholder)
    }
    requestBuilder.into(this)
}