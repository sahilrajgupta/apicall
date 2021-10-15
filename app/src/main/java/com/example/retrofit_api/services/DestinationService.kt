package com.example.retrofit_api.services

import com.example.retrofit_api.models.City
import retrofit2.Call
import retrofit2.http.POST

interface DestinationService {

    @POST
    fun getPost():Call<City>
    
}