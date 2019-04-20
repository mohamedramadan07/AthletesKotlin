package com.example.myapp

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.single_row.view.*

class RecyclerViewAdapter (val context: Context, var athletes : List<MyPojo>? ):RecyclerView.Adapter<RecyclerViewAdapter.AthleteViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): AthleteViewHolder {
        val view= LayoutInflater.from(context).inflate(R.layout.single_row,p0,false)
        return AthleteViewHolder(view)
    }


    override fun getItemCount(): Int {
        return athletes?.size!!
    }

    override fun onBindViewHolder(p0: AthleteViewHolder, p1: Int) {
            p0?.bind(athletes?.get(p1)!!)
    }



    class AthleteViewHolder(itemView:View ): RecyclerView.ViewHolder(itemView)
    {
            fun bind(athlete:MyPojo)
            {
                itemView.text_single.text=athlete.name
                if(athlete.image!="")
                {
                    Picasso.get().load(athlete.image).into(itemView.image_single)
                }


                itemView.single_row.setOnClickListener(View.OnClickListener {

                    val intent = Intent(itemView.context, DetialsActivity::class.java)

                    intent.putExtra("brief" ,athlete.brief )
                    intent.putExtra("image",athlete.image)
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    itemView.context.startActivity(intent)



                })

            }



    }


}

