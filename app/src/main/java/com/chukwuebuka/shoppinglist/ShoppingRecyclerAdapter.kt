package com.chukwuebuka.shoppinglist

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView

class ShoppingRecyclerAdapter(var itemName: List<DataSource.Product>): RecyclerView.Adapter<ShoppingViewHolder>() {



    var items: List<DataSource.Product> = ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingViewHolder {
        return ShoppingViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.shopping_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: ShoppingViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
    return items.size}

    fun submitList(Data: List<DataSource.Product>){
        items = Data
    }

}