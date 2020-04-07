package com.chukwuebuka.shoppinglist

import android.content.Intent
import android.view.View
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.shopping_list_item.view.*

class ShoppingViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val item_Name = itemView.textview

    fun bind(itemName: DataSource.Product) {

        item_Name.setText(itemName.itemName)
    }

    init {
        val itemName: DataSource
        itemView.setOnClickListener {this


            val intent = Intent(itemView.context, FruitActivity::class.java)

            itemView.context.startActivity(intent)
        }
    }
}