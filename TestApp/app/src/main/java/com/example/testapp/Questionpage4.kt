package com.example.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class Questionpage4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionpage4)

        val sixthActButton = findViewById<Button>(R.id.button6)
        sixthActButton.setOnClickListener {
            val Intent = Intent(this@Questionpage4, Questionpage5::class.java)
            startActivity(Intent)
        }
    }
}