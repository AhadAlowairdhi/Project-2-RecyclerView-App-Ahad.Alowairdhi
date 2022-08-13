package com.example.project_2_recyclerview_app.adapter

import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.model.Pizza
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// TODO(1) Build class RecyclerView, Adapter, ViewHolder.
// - Bind data with views
// - send list of data to RecyclerView
class PizzaAdapter(private val dataset : List<Pizza>, private val context : Context) : RecyclerView.Adapter<PizzaAdapter.PizzaViewHolder>() {
    // TODO[4] Create ViewHolder Class
    // Adapter helper class to arrange data in layout file
    class PizzaViewHolder(private val view : View) : RecyclerView.ViewHolder(view){

        val textView : TextView = view.findViewById(R.id.item_title)
        val imageView : ImageView = view.findViewById(R.id.item_image)
    } // End PizzaViewHolder() class

    // 3 functions
    // تعرف ملف layout الخاص بالعنصر
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaViewHolder {
        // Create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.pizza_layout, parent, false)

        return PizzaViewHolder(adapterLayout)
    }

    // تربط البيانات بالقالب الخاص بمساعدة ViewHolder
    override fun onBindViewHolder(holder: PizzaViewHolder, position: Int) {
        // save the position of item(which item I'm dealing with)
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.pizzaStringId)
        holder.imageView.setImageResource(item.pizzaImageId)
    }

    // تحدد عدد البيانات في القائمة
    override fun getItemCount() = dataset.size
} // End PizzaAdapter class