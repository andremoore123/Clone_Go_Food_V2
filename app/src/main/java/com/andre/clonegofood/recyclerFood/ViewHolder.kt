package com.andre.clonegofood.recyclerFood

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.andre.clonegofood.R

class ViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.all_food_template, parent, false)){

    private var food_picture: ImageView? = null
    private var name_food: TextView? = null
    private var total_star: TextView? = null
    private var total_distance: TextView? = null

    init {
        food_picture = itemView.findViewById(R.id.food_picture)
        name_food = itemView.findViewById(R.id.name_food)
        total_star = itemView.findViewById(R.id.total_star)
        total_distance = itemView.findViewById(R.id.total_distance)
    }

    fun bind(data: AllFood){
        food_picture?.setImageResource(data.food_picture)
        name_food?.text = data.name_food
        total_star?.text = data.total_star
        total_distance?.text = data.total_distance
    }

}