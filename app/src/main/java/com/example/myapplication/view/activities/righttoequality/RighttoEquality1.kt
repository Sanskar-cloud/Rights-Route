package com.example.myapplication.view.activities.righttoequality

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat
import com.example.myapplication.R

class RighttoEquality1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rightto_equality1)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val actionBar = supportActionBar
        actionBar?.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(this,
            R.color.nav_color
        )))

        val button = findViewById<Button>(R.id.buteql)
        button.setOnClickListener {
            val intent = Intent(this, RighttoEqualitydetail::class.java)
            startActivity(intent)
        }
        }

    }