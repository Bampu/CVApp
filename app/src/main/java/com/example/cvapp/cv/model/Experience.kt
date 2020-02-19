package com.example.cvapp.cv.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Experience(
    val company: List<Company>
): Parcelable {
}