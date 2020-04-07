package com.chukwuebuka.shoppinglist

import android.view.accessibility.AccessibilityNodeInfo

class DataSource(){

    companion object{
        fun createDataSet(): ArrayList<Product>{
            val list = ArrayList<Product>()
            list.add(
                Product(
                    "Fruit",
                    "Look for canned fruit that has no added sugar."
                )
            )
            list.add(
                Product(
                    "Vegetable",
                    "A great source of fibre, vitamin C and other nutrients."
                )
            )
            list.add(
                Product(
                    "Beans",
                    "All varieties of canned beans - from black beans to pinto beans - are a great source of plant protien."
                )
            )

            return list
        }
    }




    data class Product(
        var itemName: String,
        var itemInfo: String
    ){
        override fun toString(): String {
            return "Product(name='$itemName', detail='$itemInfo')"
        }
    }
}
