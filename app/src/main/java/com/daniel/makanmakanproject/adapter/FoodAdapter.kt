package com.daniel.makanmakanproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.daniel.makanmakanproject.databinding.ItemFoodBinding
import com.daniel.makanmakanproject.model.FoodModel

class FoodAdapter(private val foods: List<FoodModel>): RecyclerView.Adapter<FoodAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: ItemFoodBinding): RecyclerView.ViewHolder(binding.root){
        init {
            binding.root.setOnClickListener {

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemFoodBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val food = foods[position]
        with(holder){
            binding.tvFoodName.text = food.foodName
            binding.tvPrice.text = "Rp${food.foodPrice}"
            binding.tvDistance.text = "${food.foodDistance} km"
            binding.ivFood.setImageResource(food.foodImage)
        }
    }

    override fun getItemCount(): Int {
        return foods.size
    }
}