package com.example.myapplication.view.activities.educational

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myapplication.view.activities.educational.fragments.A29
import com.example.myapplication.view.activities.educational.fragments.A30

@Suppress("DEPRECATION")
internal class EducationalAdapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                A29()
            }
            1 -> {
                A30()
            }


            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}