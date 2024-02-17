package com.example.kotlinbootcamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var str1 : String? = null
    lateinit var str2 : String // going to initialize later and CAN NOT BE USED WITH VAL
    // lateinit modifier is not allowed on properties of primitive types like Int, Double
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        str2 = "Hello"
    }
}