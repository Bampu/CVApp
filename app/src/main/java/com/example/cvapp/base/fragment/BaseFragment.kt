package com.example.cvapp.base.fragment

import android.util.Log
import androidx.fragment.app.Fragment
import com.example.cvapp.base.view.AbstractView

abstract class BaseFragment : Fragment(), AbstractView {

    override fun showError(throwable: Throwable) {
        Log.e(BaseFragment::class.simpleName, "Error:" + throwable.localizedMessage)
    }
}