package com.example.cvapp.cv.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Company(
    val companyName: String,
    val startDate: String,
    val endDate: String
): Parcelable
