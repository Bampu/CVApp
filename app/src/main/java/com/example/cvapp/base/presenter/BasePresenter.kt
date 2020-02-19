package com.example.cvapp.base.presenter

import com.example.cvapp.base.view.AbstractView

abstract class BasePresenter<V: AbstractView> : Presenter<V> {

    protected var view: V? = null

    override fun attachView(view: V) {
        this.view = view
    }

    override fun detachView() {
        view = null
    }

}