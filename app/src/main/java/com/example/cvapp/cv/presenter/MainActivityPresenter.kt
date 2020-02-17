package com.example.cvapp.cv.presenter

import com.example.cvapp.base.presenter.BasePresenter
import com.example.cvapp.base.view.AbstractView
import com.example.cvapp.cv.model.DataModel
import com.example.cvapp.cv.service.GetDataTask
import com.example.cvapp.cv.service.OnDataCollectedInterface


class MainActivityPresenter : BasePresenter<MainActivityPresenter.View>() {

    init {

    }



    interface View : AbstractView {
        fun navigateToDetailsFragment()
    }
}