package com.example.myapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitAdapter {
    private  var retrofit :Retrofit? = null
    private  val BASE_URL ="https://gist.githubusercontent.com/";

    val retrofitInstance : Retrofit?
    get()  {
        if(retrofit ==null)
        {
            retrofit = retrofit2.Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return  retrofit;
    }
}