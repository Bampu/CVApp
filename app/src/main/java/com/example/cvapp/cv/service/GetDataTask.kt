package com.example.cvapp.cv.service

import android.os.AsyncTask
import android.util.Log
import com.example.cvapp.cv.callback.OnDataCollectedInterface
import com.example.cvapp.cv.model.DataModel
import com.google.gson.Gson
import java.net.HttpURLConnection
import java.net.URL

class GetDataTask(dataListener: OnDataCollectedInterface?) : AsyncTask<String, Void, String>() {

    private var listener: OnDataCollectedInterface? = dataListener

    companion object {
        private const val JSON_URL = "https://api.myjson.com/bins/151ocg"
    }

    override fun doInBackground(vararg params: String?): String {


        val res: String
        val connection = URL(JSON_URL).openConnection() as HttpURLConnection

        try {
            connection.connect()
            res = connection.inputStream.use {
                it.reader().use { reader -> reader.readText() }
            }
        } finally {
            connection.disconnect()
        }
        return res
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
        jsonResult(result)
    }

    private fun jsonResult(jsonString: String?) {
        val gson = Gson()
        val model = gson.fromJson(jsonString, DataModel.Data::class.java)

        if (listener != null) {
            listener?.onDataCollected(model)
        }
    }
}