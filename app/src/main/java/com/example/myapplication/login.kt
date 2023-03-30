package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class login : AppCompatActivity() {

    private lateinit var register: TextView
    //private lateinit var mtoolbar: Toolbar
    private lateinit var binding: ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

         window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()


            binding = ActivityLoginBinding.inflate(layoutInflater)
            setContentView(binding.root)


            firebaseAuth = FirebaseAuth.getInstance()


            binding.imageView6.setOnClickListener {
                val email = binding.editTextTextPersonName.text.toString()
                val pass = binding.editTextTextpassword.text.toString()

                if (email.isNotEmpty() && pass.isNotEmpty()) {

                    firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener {
                        if (it.isSuccessful) {
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                        } else {
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()

                        }

                        Toast.makeText(this, "Welcome to Home Page", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(this, "Empty Fields Are not Allowed !!", Toast.LENGTH_SHORT).show()

                }
            }
            binding.textView4.setOnClickListener {
                val email = binding.editTextTextPersonName.text.toString()
                if(email.isEmpty()){
                    Toast.makeText(
                        this,
                        "Email is Required.",
                        Toast.LENGTH_SHORT
                    ).show()

                }
                firebaseAuth.sendPasswordResetEmail(email)
                    .addOnCompleteListener { task ->
                        if(email.isNotEmpty()){

                            if (task.isSuccessful) {
                                // Step 5: Display success message to user
                                Toast.makeText(
                                    this,
                                    "Password reset email has been sent.",
                                    Toast.LENGTH_SHORT
                                ).show()
                            } else {
                                // Step 5: Display error message to user
                                Toast.makeText(
                                    this,
                                    "Failed to send password reset email.",
                                    Toast.LENGTH_SHORT
                                ).show()
                                // Step 4: Handle result of password reset email request
                            }
                        }
                        else{
                            Toast.makeText(this,"Email is Required",Toast.LENGTH_SHORT).show()
                        }
                    }
            }



        }

        override fun onStart() {
            super.onStart()

            

//        mtoolbar = findViewById(R.id.aToolbar)
//        setSupportActionBar(mtoolbar)

        register = findViewById<TextView>(R.id.text_register)

        register.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }



    }



}
