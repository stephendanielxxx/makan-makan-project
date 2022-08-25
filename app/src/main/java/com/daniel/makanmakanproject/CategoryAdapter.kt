package com.daniel.makanmakanproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.daniel.makanmakanproject.databinding.ItemCategoryBinding

class CategoryAdapter(private val categories: List<CategoryModel>): RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: ItemCategoryBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val categoryModel = categories[position]
        with(holder){
            binding.tvCategory.text = categoryModel.categoryName
            binding.ivCategory.setImageResource(categoryModel.categoryImage)
        }
    }

    override fun getItemCount(): Int {
        return categories.size
    }
}