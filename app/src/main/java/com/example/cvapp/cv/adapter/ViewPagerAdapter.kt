package com.example.cvapp.cv.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.cvapp.cv.model.DataModel
import com.example.cvapp.cv.view.viewpager.fragment.ExperienceDataFragment
import com.example.cvapp.cv.view.viewpager.fragment.PersonalDataFragment
import com.example.cvapp.cv.view.viewpager.fragment.TechnicalDataFragment

class ViewPagerAdapter(fragment: Fragment, private var data: DataModel.Data?) : FragmentStateAdapter(fragment) {

    companion object {
        private const val EXTRA_DATA = "extraData"
        private const val PAGES_NUMBER = 3
    }

    override fun getItemCount(): Int = PAGES_NUMBER

    override fun createFragment(position: Int): Fragment {
        var fragment = Fragment()
        when (position) {
            0 -> fragment = PersonalDataFragment()
            1 -> fragment = ExperienceDataFragment()
            2 -> fragment = TechnicalDataFragment()
        }

        fragment.arguments = Bundle().apply {
            when (fragment) {
                is PersonalDataFragment -> putParcelable(EXTRA_DATA, data)
                is ExperienceDataFragment -> putParcelable(EXTRA_DATA, data)
                is TechnicalDataFragment -> putParcelable(EXTRA_DATA, data)
            }
        }
        return fragment
    }
}