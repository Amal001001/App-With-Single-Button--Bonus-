package com.example.appwithsinglebuttonbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var et:EditText
    lateinit var button:Button
    lateinit var tv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et = findViewById(R.id.et)
        button = findViewById(R.id.button)
        tv = findViewById(R.id.tv)

        button.setOnClickListener { tv.text = et.text }
    }
}