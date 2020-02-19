package com.example.cvapp.base.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cvapp.base.presenter.BasePresenter
import com.example.cvapp.base.view.AbstractView

abstract class BaseActivity<P: BasePresenter<V>, V: AbstractView> : AppCompatActivity(), AbstractView {

    protected abstract var presenter: P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.attachView(this as V)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }

    override fun showError(throwable: Throwable) {
    }
}