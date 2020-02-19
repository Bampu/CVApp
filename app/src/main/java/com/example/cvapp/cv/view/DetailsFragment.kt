package com.example.cvapp.cv.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cvapp.R
import com.example.cvapp.base.fragment.BaseFragment
import com.example.cvapp.cv.adapter.ViewPagerAdapter
import com.example.cvapp.cv.model.DataModel
import com.example.cvapp.cv.presenter.DetailsPresenter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_details.*
import kotlinx.android.synthetic.main.fragment_personal_data.*

class DetailsFragment : BaseFragment(), DetailsPresenter.View {

    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private val presenter = DetailsPresenter()

    companion object {
        private const val PERSONAL_DATA = "Personal Data"
        private const val EXPERIENCE = "Experience"
        private const val TECHNICAL_DATA = "Technical"
        fun newInstance(): DetailsFragment {
            return DetailsFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onResume() {
        presenter.attachView(this)
        super.onResume()
    }

    override fun initializeViewPager(fetchData: DataModel.Data?) {
        viewPagerAdapter = ViewPagerAdapter(this, fetchData)
        viewpager.adapter = viewPagerAdapter

        TabLayoutMediator(tab_layout, viewpager) { tab, position ->
            when (position) {
                0 -> tab.text = PERSONAL_DATA
                1 -> tab.text = EXPERIENCE
                2 -> tab.text = TECHNICAL_DATA
            }
        }.attach()
    }
}