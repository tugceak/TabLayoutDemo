package com.example.tablayoutdemo.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tablayoutdemo.databinding.ActivityMainBinding
import com.example.tablayoutdemo.fragments.HomeFragment
import com.example.tablayoutdemo.fragments.ProfileFragment
import com.example.tablayoutdemo.fragments.SettingsFragment

internal class MyAdapter(var context: ActivityMainBinding, fm:FragmentManager, var totalTabs:Int) :FragmentPagerAdapter(fm){
    override fun getCount(): Int {
  return totalTabs
    }

    override fun getItem(position: Int): Fragment {
    return when(position){
        0 ->{
            HomeFragment()
        }
        1 ->{
            ProfileFragment()
        }
        2 ->{
            SettingsFragment()
        }
        else ->getItem(position)
    }
    }
}