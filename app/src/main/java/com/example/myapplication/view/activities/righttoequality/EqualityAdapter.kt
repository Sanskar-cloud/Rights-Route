package com.example.myapplication.view.activities.righttoequality

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myapplication.view.activities.righttoequality.fragments.A14
import com.example.myapplication.view.activities.righttoequality.fragments.A15
import com.example.myapplication.view.activities.righttoequality.fragments.A16
import com.example.myapplication.view.activities.righttoequality.fragments.A17
import com.example.myapplication.view.activities.righttoequality.fragments.A18

@Suppress("DEPRECATION")
internal class EqualityAdapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                A14()
            }
            1 -> {
                A15()
            }
            2 -> {
                A16()
            }
            3 ->{
                A17()
            }
            4 -> {
                A18()
            }
            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}