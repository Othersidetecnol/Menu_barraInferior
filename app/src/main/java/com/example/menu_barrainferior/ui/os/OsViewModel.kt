package com.example.menu_barrainferior.ui.os

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is os Fragment"
    }
    val text: LiveData<String> = _text
}
