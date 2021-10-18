package com.example.retrofit_api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.retrofit_api.models.City
import com.example.retrofit_api.services.RetroInstance
import com.example.retrofit_api.services.RetroService
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//const val BASE_URL = "https://jsonplaceholder.typicode.com/"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retroService = RetroInstance.getRetroInstance().create(RetroService::class.java)
        val searchKey = key.toString()
        val call = retroService.getCity(searchKey)

        call.enqueue(object : Callback<City>{
            override fun onResponse(call: Call<City>, response: Response<City>) {
                if(response.isSuccessful){
                    Toast.makeText(this@MainActivity,"Success",Toast.LENGTH_LONG)
                }
                else{
                    Toast.makeText(this@MainActivity,"Failed",Toast.LENGTH_LONG)
                }
            }
            override fun onFailure(call: Call<City>, t: Throwable) {
                Toast.makeText(this@MainActivity,"Failed",Toast.LENGTH_LONG)
            }
        })

    }
}
