package com.tritongames.physicstutor

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFrag = HomeFragment()
        val dashBoardFrag = DashBoardFragment()
        val physicsFrag = PhysicsTopicFragment()
        val purchaseFrag = PurchaseFragment()

        val  bottomNavigationView : BottomNavigationView? = findViewById(R.id.bottomNavView)
        bottomNavigationView?.setOnItemSelectedListener { item : MenuItem? ->

            when(item?.itemId) {
                R.id.navigation_home ->
                {
                    createFragment(homeFrag)
                    return@setOnItemSelectedListener true
                }
                R.id.navigation_dashboard ->
                {
                    createFragment((dashBoardFrag))
                    return@setOnItemSelectedListener true
                }
                R.id.navigation_lessons ->
                {
                    createFragment(physicsFrag)
                    return@setOnItemSelectedListener true
                }
                R.id.navigation_purchase ->
                {
                    createFragment(purchaseFrag)
                    return@setOnItemSelectedListener true
                }

                else -> return@setOnItemSelectedListener false
            }

        }



    }

    private fun createFragment(frag: Fragment)
    {
        supportFragmentManager.beginTransaction().replace(R.id.nav_host_fragment, frag).addToBackStack(null).commit()
    }


}


