package com.example.january13.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.january13.fragment.firstFragment
import com.example.january13.fragment.secondFragment
import com.example.january13.fragment.thirdFragment

class ViewPager(activity:AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        when (position){
            0 -> return firstFragment()
            1 -> return secondFragment()
            else -> {
                return thirdFragment()
            }
        }
    }
}