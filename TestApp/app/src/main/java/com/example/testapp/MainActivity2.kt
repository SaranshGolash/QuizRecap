package com.example.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Rules : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val secondActButton = findViewById<Button>(R.id.button2)
        secondActButton.setOnClickListener {
            val Intent = Intent(this@Rules, Questionpage1::class.java)
            startActivity(Intent)
        }
    }
}