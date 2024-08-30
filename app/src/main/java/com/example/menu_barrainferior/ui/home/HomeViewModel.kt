package com.example.menu_barrainferior.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "teste de edição de texto Home"
    }
    val text: LiveData<String> = _text



}
