package com.daniel.makanmakanproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.daniel.makanmakanproject.R
import com.daniel.makanmakanproject.databinding.ActivityHomeBinding
import com.daniel.makanmakanproject.fragment.ExploreFragment
import com.daniel.makanmakanproject.fragment.FavouritesFragment
import com.daniel.makanmakanproject.fragment.HomeFragment
import com.daniel.makanmakanproject.fragment.SettingFragment

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showHomeFragment()

        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_home -> {
                    Toast.makeText(
                        this@HomeActivity, "Menu Home",
                        Toast.LENGTH_SHORT
                    ).show()
                    showHomeFragment()
                }
                R.id.menu_explore -> {
                    Toast.makeText(
                        this@HomeActivity, "Menu Explore",
                        Toast.LENGTH_SHORT
                    ).show()
                    showExploreFragment()
                }
                R.id.menu_favourites -> {
                    Toast.makeText(
                        this@HomeActivity, "Menu Favourite",
                        Toast.LENGTH_SHORT
                    ).show()
                    showFavouritesFragment()
                }
                R.id.menu_setting -> {
                    Toast.makeText(
                        this@HomeActivity, "Menu Setting",
                        Toast.LENGTH_SHORT
                    ).show()
                    showSettingFragment()
                }
            }
            true
        }

    }

    private fun showHomeFragment() {
        val homeFragment = HomeFragment.newInstance("", "")
        supportFragmentManager.beginTransaction().replace(R.id.container, homeFragment).commit()
    }

    private fun showExploreFragment() {
        val exploreFragment = ExploreFragment.newInstance("", "")
        supportFragmentManager.beginTransaction().replace(R.id.container, exploreFragment).commit()
    }

    private fun showFavouritesFragment() {
        val favouritesFragment = FavouritesFragment.newInstance("", "")
        supportFragmentManager.beginTransaction().replace(R.id.container, favouritesFragment).commit()
    }

    private fun showSettingFragment() {
        val settingFragment = SettingFragment.newInstance("", "")
        supportFragmentManager.beginTransaction().replace(R.id.container, settingFragment).commit()
    }
}