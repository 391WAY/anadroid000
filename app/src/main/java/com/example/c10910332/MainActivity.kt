package com.example.c10910332

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var myt1:TextView=findViewById<TextView>(R.id.dd)
        myt1.text = "Hello!!!!"
    }
}