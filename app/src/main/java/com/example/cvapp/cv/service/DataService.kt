package com.example.cvapp.cv.service

import com.example.cvapp.cv.model.DataModel

interface DataService {

    fun getData(url: String) : DataModel
}