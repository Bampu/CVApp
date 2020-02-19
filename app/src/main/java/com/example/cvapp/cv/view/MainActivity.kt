package com.example.cvapp.cv.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.cvapp.R
import com.example.cvapp.base.activity.BaseActivity
import com.example.cvapp.cv.presenter.MainActivityPresenter

class MainActivity : BaseActivity<MainActivityPresenter, MainActivityPresenter.View>(), MainActivityPresenter.View {

    override var presenter: MainActivityPresenter = MainActivityPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeFragment(DetailsFragment.newInstance())
    }

    override fun onResume() {
        super.onResume()
        presenter.attachView(this)
    }

    override fun onPause() {
        presenter.detachView()
        super.onPause()
    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }

}
