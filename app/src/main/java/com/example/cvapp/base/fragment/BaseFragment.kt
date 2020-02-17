package com.example.cvapp.base.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import com.example.cvapp.base.presenter.BasePresenter
import com.example.cvapp.base.view.AbstractView

abstract class BaseFragment<P: BasePresenter<V>, V: AbstractView> : Fragment() {

    private val  presenter: P? = null
    private val view: V? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter?.attachView(this.view as V)
    }

    override fun onDestroyView() {
        presenter?.detachView()
        super.onDestroyView()
    }
}