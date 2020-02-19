package com.example.cvapp.cv.callback

import com.example.cvapp.cv.model.DataModel

interface OnDataCollectedInterface {
    fun onDataCollected(data: DataModel.Data)
}