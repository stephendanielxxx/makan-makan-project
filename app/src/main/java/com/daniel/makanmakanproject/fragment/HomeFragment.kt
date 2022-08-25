package com.daniel.makanmakanproject.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.daniel.makanmakanproject.adapter.CategoryAdapter
import com.daniel.makanmakanproject.model.CategoryModel
import com.daniel.makanmakanproject.R
import com.daniel.makanmakanproject.adapter.FoodAdapter
import com.daniel.makanmakanproject.adapter.NewFoodAdapter
import com.daniel.makanmakanproject.databinding.FragmentHomeBinding
import com.daniel.makanmakanproject.model.FoodModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var binding: FragmentHomeBinding
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var foodAdapter: FoodAdapter
    private lateinit var favoriteAdapter: FoodAdapter
    private lateinit var newFoodAdapter: NewFoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvCategory.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.rvNearby.layoutManager =
            LinearLayoutManager(requireActivity(), RecyclerView.HORIZONTAL, false)
        binding.rvFavorite.layoutManager =
            LinearLayoutManager(requireActivity(), RecyclerView.HORIZONTAL, false)
        binding.rvNewPlace.layoutManager = LinearLayoutManager(requireActivity())

        setCategories()
        setNearbyFood()
        setFavoriteFood()
        setNewFood()

    }

    private fun setNewFood() {
        val foods = arrayListOf<FoodModel>()
        foods.add(FoodModel(1, "Resto Sate Pak Kumis, Bogor Utara", R.drawable.sate, 10000,
            1f, "Sate"))
        foods.add(FoodModel(2, "Soto Mie Bogor Asli, Bogor Selatan", R.drawable.soto, 225000,
            1.2f, "Bakso"))
        foods.add(FoodModel(3, "Icibang Sushi, Bogor Barat", R.drawable.sushi, 8000,
            1.8f, "Jajanan"))
        foods.add(FoodModel(4, "Ayam Goreng Kaepci, Bogor Timur", R.drawable.ayam, 15000,
            2.2f, "Nasi"))
        foods.add(FoodModel(5, "Es Cendol Dawet Ambyar, Cibinong", R.drawable.cendol, 5000,
            2.5f, "Minuman"))

        newFoodAdapter = NewFoodAdapter(foods)
        binding.rvNewPlace.adapter = newFoodAdapter
    }

    private fun setFavoriteFood() {
        val foods = arrayListOf<FoodModel>()
        foods.add(FoodModel(1, "Odading Mang Ucup", R.drawable.odading, 10000, 1f))
        foods.add(FoodModel(2, "Bakso Mang Oleng", R.drawable.bakso, 225000, 1.2f))
        foods.add(FoodModel(3, "Cakue Galaxy", R.drawable.cakue, 8000, 1.8f))
        foods.add(FoodModel(4, "Nasi Padang Idola", R.drawable.padang, 15000, 2.2f))
        foods.add(FoodModel(5, "Pletok Ababil", R.drawable.pletok, 5000, 2.5f))
        foods.add(FoodModel(6, "Boba Kekinian", R.drawable.boba, 32000, 2.6f))
        favoriteAdapter = FoodAdapter(foods)
        binding.rvFavorite.adapter = favoriteAdapter
    }

    private fun setNearbyFood() {
        val foods = arrayListOf<FoodModel>()
        foods.add(FoodModel(1, "Odading Mang Ucup", R.drawable.odading, 10000, 1f))
        foods.add(FoodModel(2, "Bakso Mang Oleng", R.drawable.bakso, 225000, 1.2f))
        foods.add(FoodModel(3, "Cakue Galaxy", R.drawable.cakue, 8000, 1.8f))
        foods.add(FoodModel(4, "Nasi Padang Idola", R.drawable.padang, 15000, 2.2f))
        foods.add(FoodModel(5, "Pletok Ababil", R.drawable.pletok, 5000, 2.5f))
        foods.add(FoodModel(6, "Boba Kekinian", R.drawable.boba, 32000, 2.6f))
        foodAdapter = FoodAdapter(foods)
        binding.rvNearby.adapter = foodAdapter
    }

    private fun setCategories() {
        val categories = arrayListOf<CategoryModel>()
        categories.add(CategoryModel(1, "chicken", R.drawable.chicken))
        categories.add(CategoryModel(2, "steak", R.drawable.dish))
        categories.add(CategoryModel(3, "donut", R.drawable.donut))
        categories.add(CategoryModel(4, "hamburger", R.drawable.hamburger))
        categories.add(CategoryModel(5, "pizza", R.drawable.pizza))
        categories.add(CategoryModel(6, "ramen", R.drawable.ramen))
        categories.add(CategoryModel(7, "salad", R.drawable.salad))

        categoryAdapter = CategoryAdapter(categories)
        binding.rvCategory.adapter = categoryAdapter
    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}