package com.andre.clonegofood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.andre.clonegofood.recyclerFood.AllFood
import com.andre.clonegofood.recyclerFood.foodAdapter
import com.andre.clonegofood.recyclerPromo.AllPromo
import com.andre.clonegofood.recyclerPromo.promoAdapter
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView_food: RecyclerView
    private lateinit var adapter_food: foodAdapter

    private lateinit var recyclerView_promo: RecyclerView
    private lateinit var adapter_promo: promoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()



        recycler_all_food()
        recycler_all_promo()

        recyclerView_food.layoutManager = LinearLayoutManager(this)
        recyclerView_food.adapter = adapter_food

        recyclerView_promo.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true)
        recyclerView_promo.adapter = adapter_promo

        NavigationBarView.OnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.item1 -> {
                    // Respond to navigation item 1 click
                    true
                }
                R.id.item2 -> {
                    // Respond to navigation item 2 click
                    true
                }
                else -> false
            }
        }
    }

    private fun recycler_all_food(){
        recyclerView_food = findViewById(R.id.reycler_view_food)

        var data = ArrayList<AllFood>()
        data.add(AllFood(R.drawable.food_pizza_hut, "Pizza Hut", "3.4","3.4 km"))
        data.add(AllFood(R.drawable.food_pizza_hut, "Pizza Hut", "3.4","3.4 km"))
        data.add(AllFood(R.drawable.food_pizza_hut, "Pizza Hut", "3.4","3.4 km"))
        data.add(AllFood(R.drawable.food_pizza_hut, "Pizza Hut", "3.4","3.4 km"))
        data.add(AllFood(R.drawable.food_pizza_hut, "Pizza Hut", "3.4","3.4 km"))
        data.add(AllFood(R.drawable.food_pizza_hut, "Pizza Hut", "3.4","3.4 km"))

        adapter_food = foodAdapter(data)
    }

    private fun recycler_all_promo(){
        recyclerView_promo = findViewById(R.id.recycle_view_promo)

        var data = ArrayList<AllPromo>()
        data.add(AllPromo(R.drawable.food_promo, "Beef Crispy", 12500, 15000))
        data.add(AllPromo(R.drawable.food_promo, "Beef Crispy", 12500, 15000))
        data.add(AllPromo(R.drawable.food_promo, "Beef Crispy", 12500, 15000))
        data.add(AllPromo(R.drawable.food_promo, "Beef Crispy", 12500, 15000))
        data.add(AllPromo(R.drawable.food_promo, "Beef Crispy", 12500, 15000))
        data.add(AllPromo(R.drawable.food_promo, "Beef Crispy", 12500, 15000))

        adapter_promo = promoAdapter(data)
    }
}