package com.daniel.makanmakanproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.daniel.makanmakanproject.databinding.ItemFoodV2Binding
import com.daniel.makanmakanproject.model.FoodModel

class NewFoodAdapter(private val foodList: List<FoodModel>): RecyclerView.Adapter<NewFoodAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: ItemFoodV2Binding): RecyclerView.ViewHolder(binding.root){
        init {
            binding.root.setOnClickListener {
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemFoodV2Binding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val food = foodList[position]
        with(holder){
            binding.tvFoodName.text = food.foodName
            binding.tvDistance.text = "${food.foodDistance} km"
            binding.tvCategory.text = food.foodCategory
            binding.ivFood.setImageResource(food.foodImage)
        }
    }

    override fun getItemCount(): Int {
        return foodList.size
    }
}