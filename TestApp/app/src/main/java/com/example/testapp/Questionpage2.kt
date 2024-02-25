package com.example.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Questionpage2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionpage2)

        val fourthActButton = findViewById<Button>(R.id.button4)
        fourthActButton.setOnClickListener {
            val Intent = Intent(this@Questionpage2, Questionpage3::class.java)
            startActivity(Intent)
        }
    }
}