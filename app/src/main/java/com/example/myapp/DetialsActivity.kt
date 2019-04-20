package com.example.myapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detials.*
import kotlinx.android.synthetic.main.single_row.view.*

class DetialsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detials)
        var imageURL= intent.extras.getString("image")

        Log.v("brief",intent.extras.getString("brief"))

        Picasso.get().load(imageURL).into(details_img)
        details_txt.text=intent.extras.getString("brief")

    }
}
