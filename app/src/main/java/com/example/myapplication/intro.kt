package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button

class intro : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()

        val button = findViewById<Button>(R.id.btn_login)
        button.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.btn_signup)
        button2.setOnClickListener{
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }

    }
}