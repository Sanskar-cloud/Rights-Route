package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Rightreligion1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rightreligion1)

        val button = findViewById<Button>(R.id.buteql)
        button.setOnClickListener{
            val intent = Intent(this, Rightreligion2::class.java)
            startActivity(intent)
        }
    }
}