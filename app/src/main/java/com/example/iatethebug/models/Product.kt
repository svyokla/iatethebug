package com.example.iatethebug.models

//модель товара
data class Product(
    var name : String,
    var image: String,
    var price: Double,
    var description: String,
    var amount: Int
)
