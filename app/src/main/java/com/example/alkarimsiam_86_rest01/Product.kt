package com.example.alkarimsiam_86_rest01

data class Product(
    val images:List<String>,
    val title:String,
    val price:Double,
    val description:String,
    val id:Int
)