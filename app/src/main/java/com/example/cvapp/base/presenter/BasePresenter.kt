package com.example.cvapp.base.presenter

import com.example.cvapp.base.view.AbstractView

abstract class BasePresenter<V: AbstractView> {

    private var view: V? = null

    fun attachView(view: V) {
        this.view = view
    }

    fun detachView() {
        view = null
    }
}