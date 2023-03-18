package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardView = findViewById<CardView>(R.id.card1)
        cardView.setOnClickListener {
            val intent = Intent(this, RighttoEquality1::class.java)
            startActivity(intent)
        }

        val cardView2 = findViewById<CardView>(R.id.card2)
        cardView2.setOnClickListener {
            val intent = Intent(this, RightToFreedom::class.java)
            startActivity(intent)
        }

        val cardView3 = findViewById<CardView>(R.id.card3)
        cardView3.setOnClickListener {
            val intent = Intent(this, Righttoexpl::class.java)
            startActivity(intent)
        }


    }



}