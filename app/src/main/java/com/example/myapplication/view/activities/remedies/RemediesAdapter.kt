package com.example.myapplication.view.activities.remedies

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myapplication.view.activities.remedies.fragments.A32

@Suppress("DEPRECATION")
internal class RemediesAdapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                A32()
            }


            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}