package com.example.project_2_recyclerview_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.project_2_recyclerview_app.adapter.PizzaAdapter
import com.example.project_2_recyclerview_app.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Connect the adapter with the data here
        // Bind the recyclerview and the adapter here

        // Data Source
        val pizzaList = DataSource().loadPizza()
        // adapter
        val adapter = PizzaAdapter(pizzaList, this)
        // RecyclerView
        val recyclerView : RecyclerView = findViewById(R.id.rv_pizza)
        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true) // to fixed size for recyclerView
    }
}