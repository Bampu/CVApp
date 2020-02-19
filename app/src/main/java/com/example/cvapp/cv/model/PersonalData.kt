package com.example.cvapp.cv.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PersonalData(
    val firstName: String,
    val lastName: String,
    val position: String,
    val phoneNumber: String,
    val email: String,
    val city: String
): Parcelable {
}