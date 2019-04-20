package com.example.myapp

import retrofit2.Call
import retrofit2.http.GET

interface GetAthleteService {
    @GET("MohamedWael/1406437f14e9a769a3a572a78906388f/raw/5be50e67c96c5ed1da9fe6344d2dd7befef0ba25/?fbclid=IwAR2fsRCnZ5YFU0YAK1Mcjzos_xmzjWYD9VOfxgdA7cdA0rZG1eEEaUA6pU0")
    fun getAllAthletes(): Call<AthletesList>
}