package com.example.cvapp.cv.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

class DataModel {

    @Parcelize
    data class Data(
        val personal: PersonalData,
        val experience: Experience,
        val technical: Technical
    ) : Parcelable
}
