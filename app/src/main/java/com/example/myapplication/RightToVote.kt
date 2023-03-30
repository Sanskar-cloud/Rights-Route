package com.example.myapplication

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat

class RightToVote : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_right_to_vote)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val actionBar = supportActionBar
        actionBar?.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(this, R.color.nav_color)))


        val button = findViewById<Button>(R.id.buteql)
        button.setOnClickListener {
            val intent = Intent(this, righttovote2::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.voter)
        button2.setOnClickListener {
            val intent = Intent(this, Web3::class.java)
            startActivity(intent)
        }

    }
}