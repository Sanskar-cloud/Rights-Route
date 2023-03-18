package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RightTofreedom2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_right_tofreedom2)


        val button = findViewById<Button>(R.id.jano)
        button.setOnClickListener{
            val intent = Intent(this, RightToFreedom::class.java)
            startActivity(intent)
        }
    }
}