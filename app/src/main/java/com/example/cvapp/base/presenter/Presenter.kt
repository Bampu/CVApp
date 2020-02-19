package com.example.cvapp.base.presenter

import com.example.cvapp.base.view.AbstractView

interface Presenter<V : AbstractView> {
    fun attachView(view : V)
    fun detachView()

}