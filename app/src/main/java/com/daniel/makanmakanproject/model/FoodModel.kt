package com.daniel.makanmakanproject.model

data class FoodModel(
    val foodId: Int,
    val foodName: String,
    val foodImage: Int,
    val foodPrice: Int,
    val foodDistance: Float,
    val foodCategory: String = ""
)
