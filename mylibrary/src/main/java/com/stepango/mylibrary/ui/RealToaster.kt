package com.stepango.mylibrary.ui

import android.content.Context
import android.widget.Toast

class RealToaster(private val context: Context) : Toaster {

    override fun show(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}
