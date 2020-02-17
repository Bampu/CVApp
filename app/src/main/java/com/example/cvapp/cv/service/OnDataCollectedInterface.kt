package com.example.cvapp.cv.service

import com.example.cvapp.cv.model.DataModel

interface OnDataCollectedInterface {
    fun onDataCollected(data: DataModel)
}