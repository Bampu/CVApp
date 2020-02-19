package com.example.cvapp.cv.view.viewpager.presenter

import com.example.cvapp.base.presenter.BasePresenter
import com.example.cvapp.base.view.AbstractView

class PersonalDataPresenter : BasePresenter<PersonalDataPresenter.View>() {

    companion object {
        private const val URL = "https://www.linkedin.com/in/konrad-tomp%C3%B3r-082867b0/"
        private const val PHONE_NUMBER = "795-798-788"
    }

    override fun attachView(view: View) {
        super.attachView(view)
        view.setNewPhoneNumber(PHONE_NUMBER)
    }
    fun getLinkedInUrl(): String? {
        return URL
    }

    interface View : AbstractView {
        fun setNewPhoneNumber(number: String)
    }
}