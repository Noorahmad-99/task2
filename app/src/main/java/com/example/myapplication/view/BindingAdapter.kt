package com.example.myapplication.view

import android.view.View
import android.widget.Toast
import androidx.databinding.BindingAdapter

@BindingAdapter("Show")
 fun getToast(view: View, text: String) {
    Toast.makeText(view.context, text,Toast.LENGTH_SHORT).show()
}