package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Welcome : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()

        val button = findViewById<Button>(R.id.btn_login)
        button.setOnClickListener{
            val intent = Intent(this, login::class.java)
            startActivity(intent)

            Toast.makeText(this, "Welcome to SignIn", Toast.LENGTH_SHORT).show()
        }
        val button2 = findViewById<Button>(R.id.btn_signup)
        button2.setOnClickListener{
            val intent = Intent(this, signup::class.java)
            startActivity(intent)

            Toast.makeText(this, "Create New Account", Toast.LENGTH_SHORT).show()
        }


    }
}