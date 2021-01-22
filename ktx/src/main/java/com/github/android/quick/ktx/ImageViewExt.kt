package com.github.android.quick.ktx

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
