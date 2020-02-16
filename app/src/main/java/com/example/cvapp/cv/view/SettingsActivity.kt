package com.example.cvapp.cv.view

import android.os.Bundle
import com.example.cvapp.R
import com.example.cvapp.base.activity.BaseActivity
import com.example.cvapp.cv.presenter.SettingsPresenter

class SettingsActivity : BaseActivity<SettingsPresenter.View, SettingsPresenter>(), SettingsPresenter.View {

    override var presenter: SettingsPresenter = SettingsPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        presenter.attachView(this)
    }

    override fun onPause() {
        presenter.detachView()
        super.onPause()
    }

}
