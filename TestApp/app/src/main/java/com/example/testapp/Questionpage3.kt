package com.example.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Questionpage3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionpage3)

        val fifthActButton = findViewById<Button>(R.id.button5)
        fifthActButton.setOnClickListener {
            val Intent = Intent(this@Questionpage3, Questionpage4::class.java)
            startActivity(Intent)
        }
    }
}