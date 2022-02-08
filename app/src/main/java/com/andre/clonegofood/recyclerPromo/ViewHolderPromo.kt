package com.andre.clonegofood.recyclerPromo

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.andre.clonegofood.R

class ViewHolderPromo(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.all_promo_template, parent, false)){

    private var button_promo: ImageView? = null
    private var promo_food_name: TextView? = null
    private var promo_harga: TextView? = null
    private var promo_normal: TextView? = null

    init {
        button_promo = itemView.findViewById(R.id.promo_picture)
        promo_food_name = itemView.findViewById(R.id.promo_food_name)
        promo_harga = itemView.findViewById(R.id.promo_harga)
        promo_normal = itemView.findViewById(R.id.promo_normal)

        promo_normal?.apply {
            paintFlags = paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        }
    }

    fun bind(data: AllPromo){
        button_promo?.setImageResource(data.food_picture)
        promo_food_name?.text = data.name_food
        promo_harga?.text = data.new_price.toString()
        promo_normal?.text = data.price.toString()

    }

}