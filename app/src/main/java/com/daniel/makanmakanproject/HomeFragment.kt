package com.daniel.makanmakanproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.daniel.makanmakanproject.databinding.FragmentHomeBinding

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
    private lateinit var adapter: CategoryAdapter

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

        binding.rvCategory.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        val categories = arrayListOf<CategoryModel>()

        val chickenModel = CategoryModel(1, "Chicken", R.drawable.chicken)
        val dishModel = CategoryModel(2, "Dish", R.drawable.dish)
        val donutModel = CategoryModel(3, "Donut", R.drawable.donut)
        val hamburgerModel = CategoryModel(4,"Hamburger", R.drawable.hamburger)
        val pizzaModel = CategoryModel(5, "Pizza", R.drawable.pizza)
        val ramenModel = CategoryModel(6, "Ramen", R.drawable.ramen)
        val saladModel = CategoryModel(7, "Salad", R.drawable.salad)

        categories.add(chickenModel)
        categories.add(dishModel)
        categories.add(donutModel)
        categories.add(hamburgerModel)
        categories.add(pizzaModel)
        categories.add(ramenModel)
        categories.add(saladModel)

        adapter = CategoryAdapter(categories)
        binding.rvCategory.adapter = adapter
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