package com.example.retrofit_api.helpers

import androidx.lifecycle.ViewModel
import com.example.retrofit_api.services.RetroInstance
import com.example.retrofit_api.services.RetroService

class ViewModel : ViewModel() {
    fun getData(searchKey : String) {
        val retroService = RetroInstance.getRetroInstance().create(RetroService::class.java)

    }
}