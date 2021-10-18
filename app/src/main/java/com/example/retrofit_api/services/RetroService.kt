package com.example.retrofit_api.services

import com.example.retrofit_api.models.City
import retrofit2.Call

import retrofit2.http.Body
import retrofit2.http.HEAD
import retrofit2.http.Headers
import retrofit2.http.POST

interface RetroService {

    @POST("city")
    @Headers("Accept:application/json", "Content-Type:application/aajson")
    fun getCity(@Body searchKey:String) : Call<City>
}