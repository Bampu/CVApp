package com.example.cvapp.cv.view

import com.example.cvapp.base.fragment.BaseFragment
import com.example.cvapp.base.presenter.BasePresenter
import com.example.cvapp.cv.model.DataModel
import com.example.cvapp.cv.presenter.DetailsPresenter
import com.example.cvapp.cv.service.OnDataCollectedInterface

class DetailsFragment: BaseFragment<BasePresenter<DetailsPresenter.View>, DetailsPresenter.View>(),
    OnDataCollectedInterface {

    companion object {
        val TAG = DetailsFragment::class.simpleName
    }

    override fun onDataCollected(data: DataModel) {
    }
}