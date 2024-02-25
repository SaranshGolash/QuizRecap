package com.example.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Questionpage1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val thirdActButton = findViewById<Button>(R.id.button3)
        thirdActButton.setOnClickListener {
            val Intent = Intent(this@Questionpage1, Questionpage2::class.java)
            startActivity(Intent)
        }
    }
}