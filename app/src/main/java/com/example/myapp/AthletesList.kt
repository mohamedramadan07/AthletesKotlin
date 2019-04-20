package com.example.myapp

import com.google.gson.annotations.SerializedName

data class AthletesList(@SerializedName("athletes") var athletes : List<MyPojo>) {
}