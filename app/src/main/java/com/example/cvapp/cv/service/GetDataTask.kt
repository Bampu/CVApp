package com.example.cvapp.cv.service

import android.os.AsyncTask
import android.util.Log
import com.example.cvapp.cv.model.DataModel
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

class GetDataTask : AsyncTask<String, Void, String>() {

    private val dataListener: OnDataCollectedInterface? = null

    companion object {
        private const val JSON_URL = "https://api.myjson.com/bins/1at66c"
//      private const val URL_ = "https://api.github.com/gists/a53f59e0fa9ff113c4af6d9b574b9ce8"
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
        Log.i("json", res)
        return res
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
        jsonResult(result)
    }

    private fun jsonResult(jsonString: String?) {
        val jsonObject = JSONObject(jsonString)

        val model = DataModel(
            jsonObject.getString("firstName"),
            jsonObject.getString("lastName"),
            jsonObject.getInt("age")
        )
        if(dataListener != null) {
            dataListener.onDataCollected(model)
        }
    }
}