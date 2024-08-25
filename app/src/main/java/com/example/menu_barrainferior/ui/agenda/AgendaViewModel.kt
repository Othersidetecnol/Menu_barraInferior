package com.example.menu_barrainferior.ui.agenda

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AgendaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is agenda Fragment"
    }
    val text: LiveData<String> = _text
}
