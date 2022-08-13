package com.example.project_2_recyclerview_app.data

import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.model.Pizza

class DataSource {
    // list of items
    fun loadPizza() : List<Pizza> {
        return listOf(
            Pizza(R.string.pizza1, R.drawable.pizza1),
            Pizza(R.string.pizza2, R.drawable.pizza2),
            Pizza(R.string.pizza3, R.drawable.pizza3),
            Pizza(R.string.pizza4, R.drawable.pizza4),
            Pizza(R.string.pizza5, R.drawable.pizza5),
            Pizza(R.string.pizza6, R.drawable.pizza6),
            Pizza(R.string.pizza7, R.drawable.pizza7),
            Pizza(R.string.pizza8, R.drawable.pizza8)
        )

    }
}