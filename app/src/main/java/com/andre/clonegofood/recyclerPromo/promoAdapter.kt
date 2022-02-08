package com.andre.clonegofood.recyclerPromo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class promoAdapter (private  val data: ArrayList<AllPromo>): RecyclerView.Adapter<ViewHolderPromo>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderPromo {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        return ViewHolderPromo(inflater, parent)
    }

    override fun onBindViewHolder(holder: ViewHolderPromo, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }


}