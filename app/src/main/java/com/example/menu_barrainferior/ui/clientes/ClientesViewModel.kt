package com.example.menu_barrainferior.ui.clientes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ClientesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is clientes Fragment"
    }
    val text: LiveData<String> = _text
}
