package com.example.jimenez_info

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount() = 4

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PersonalFragment()
            1 -> ExpertiseFragment()
            2 -> EducationFragment()
            else -> ExperienceFragment()
        }
    }
}