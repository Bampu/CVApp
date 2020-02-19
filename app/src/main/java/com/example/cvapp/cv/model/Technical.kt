package com.example.cvapp.cv.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Technical(
    val langs: String,
    val archs: String,
    val frameworks: String
): Parcelable {
}