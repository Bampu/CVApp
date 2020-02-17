package com.example.cvapp.cv.model

class DataModel(private val firstName: String, private val lastName: String, private val age: Int) {
   data class Info(
       val firstName: String,
       val lastName: String,
       val age: Int
       //val skills: Skills
   )

//    data class Skills(
//        val langs: ArrayList<String> = arrayListOf(),
//        val archs: ArrayList<String> = arrayListOf()
//    )

}


//{
//    "firstName": "konrad",
//    "lastName": "tompór",
//    "age": 28,
//    "skills": {
//    "archiceture": [
//    "mvp",
//    "mvvm"
//    ],
//    "languages": [
//    "cpp",
//    "java",
//    "kotlin"
//    ]
//}
//}