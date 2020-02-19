package com.example.cvapp.cv.view.viewpager.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cvapp.R
import com.example.cvapp.base.fragment.BaseFragment
import com.example.cvapp.cv.model.DataModel
import com.example.cvapp.cv.view.viewpager.fragment.adapter.CompanyListAdapter
import com.example.cvapp.cv.view.viewpager.presenter.ExperienceDataPresenter
import kotlinx.android.synthetic.main.fragment_experience_data.*

class ExperienceDataFragment : BaseFragment(), ExperienceDataPresenter.View {

    companion object {
        private const val EXTRA_DATA = "extraData"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_experience_data, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey(EXTRA_DATA) }?.apply {
            val model: DataModel.Data? = getParcelable(EXTRA_DATA)
            displayData(model)
        }
    }

    private fun displayData(model: DataModel.Data?) {
        recyclerView.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = model?.experience?.company?.let { CompanyListAdapter(it) }
        }
    }
}