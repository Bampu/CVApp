package com.example.cvapp.cv.presenter

import com.example.cvapp.base.presenter.BasePresenter
import com.example.cvapp.base.view.AbstractView
import com.example.cvapp.cv.model.DataModel
import com.example.cvapp.cv.service.GetDataTask
import com.example.cvapp.cv.callback.OnDataCollectedInterface

class DetailsPresenter : BasePresenter<DetailsPresenter.View>() {

    override fun attachView(view: View) {
        getData()
        super.attachView(view)
    }
    fun getData() {
        val task = GetDataTask(object : OnDataCollectedInterface {
            override fun onDataCollected(data: DataModel.Data) {
                view?.initializeViewPager(data)
            }
        })
        task.execute()
    }


    interface View : AbstractView {
        fun initializeViewPager(fetchData: DataModel.Data?)
    }
}