package com.example.myapplication.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow

class MainViewModel : ViewModel() {

    private var _currentText = MutableLiveData<String>("Welcome to my world")
    val currentText: LiveData<String>
        get() = _currentText

    init {
        flow {
            emit(_currentText)
            delay(2000)
        }
    }
}