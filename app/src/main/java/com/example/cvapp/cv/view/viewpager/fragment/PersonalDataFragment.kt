package com.example.cvapp.cv.view.viewpager.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cvapp.R
import com.example.cvapp.base.fragment.BaseFragment
import com.example.cvapp.cv.model.DataModel
import com.example.cvapp.cv.view.viewpager.presenter.PersonalDataPresenter
import kotlinx.android.synthetic.main.fragment_personal_data.*

class PersonalDataFragment : BaseFragment(), PersonalDataPresenter.View {

    private val presenter = PersonalDataPresenter()

    companion object {
        private const val EXTRA_DATA = "extraData"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_personal_data, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey(EXTRA_DATA) }?.apply {
            val model: DataModel.Data? = getParcelable(EXTRA_DATA)
            displayData(model)
        }
        ib_linkedin.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(presenter.getLinkedInUrl()))
            startActivity(browserIntent)
        }
    }

    private fun displayData(model: DataModel.Data?) {
        firstName.text = model?.personal?.firstName
        lastName.text = model?.personal?.lastName
        position.append(" " + model?.personal?.position)
        phoneNumber.append(" " + model?.personal?.phoneNumber)
        email.append(" " + model?.personal?.email)
        city.append(" " + model?.personal?.city)
    }

    override fun setNewPhoneNumber(number: String) {
        phoneNumber.text = number
    }
}