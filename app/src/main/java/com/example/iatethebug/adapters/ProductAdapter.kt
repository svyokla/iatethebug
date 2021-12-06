package com.example.iatethebug.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.iatethebug.R
import com.example.iatethebug.models.Product

class ProductAdapter(private val array: ArrayList<Product>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val productName: TextView = view.findViewById(R.id.productName)
        val productPic: ImageView = view.findViewById(R.id.productPic)
        val price: TextView = view.findViewById(R.id.price)
        val amount: TextView = view.findViewById(R.id.amount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_product_cell, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = array[position]
        holder.productName.text = item.name
        Glide.with(holder.itemView).load(item.image).into(holder.productPic)
        holder.amount.text = item.amount.toString()
        holder.price.text = item.price.toString()

    }

    override fun getItemCount(): Int {
        return array.size
    }
}