package com.chukwuebuka.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var shoppingAdapter: ShoppingRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSet()
    }


    private fun addDataSet(){
        val data = DataSource.createDataSet()
        shoppingAdapter.submitList(data)
    }

    private fun initRecyclerView(){

        recycler.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val topSpacingDecorator = TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingDecorator)
            shoppingAdapter = ShoppingRecyclerAdapter(itemName = DataSource.createDataSet())
            adapter = shoppingAdapter
        }
    }

}
