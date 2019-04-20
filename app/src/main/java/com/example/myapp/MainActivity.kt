package com.example.myapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val service = RetrofitAdapter.retrofitInstance?.create(GetAthleteService::class.java)
        val responseCall = service?.getAllAthletes()
        responseCall?.enqueue( object : Callback<AthletesList>{
            override fun onFailure(call: Call<AthletesList>, t: Throwable) {

            }

            override fun onResponse(call: Call<AthletesList>, response: Response<AthletesList>) {
                val body=response?.body()
                val athletes = body?.athletes
                val numb = athletes?.size
                val mLayoutManager = LinearLayoutManager(this@MainActivity)

                val adapter= RecyclerViewAdapter(applicationContext, athletes!!)
                myrecycler.layoutManager = mLayoutManager
                myrecycler.adapter = adapter

            }

        })



    }
}
