package com.example.cvapp.cv.view.viewpager.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cvapp.R
import com.example.cvapp.base.fragment.BaseFragment
import com.example.cvapp.cv.model.DataModel
import com.example.cvapp.cv.view.viewpager.presenter.TechnicalDataPresenter
import kotlinx.android.synthetic.main.fragment_technical_data.*

class TechnicalDataFragment : BaseFragment(), TechnicalDataPresenter.View {
    companion object {
        private const val EXTRA_DATA = "extraData"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_technical_data, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey(EXTRA_DATA) }?.apply {
            val model: DataModel.Data? = getParcelable(EXTRA_DATA)
            displayData(model)
        }
    }

    private fun displayData(model: DataModel.Data?) {
        langs.append("\n" + model?.technical?.langs)
        archs.append("\n" + model?.technical?.archs)
        frameworks.append("\n" + model?.technical?.frameworks)
    }
}