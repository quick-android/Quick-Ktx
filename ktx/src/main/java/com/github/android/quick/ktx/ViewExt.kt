package com.github.android.quick.ktx

import android.view.View

inline fun View.setOnSafeClickListener(intervalMs: Int = 800, crossinline action: (View)-> Unit) {
    var lastClick = 0L
    setOnClickListener {
        val now = System.currentTimeMillis()
        val interval = now - lastClick
        lastClick = now
        if (interval < intervalMs) {
            return@setOnClickListener
        }
        action.invoke(it)
    }
}