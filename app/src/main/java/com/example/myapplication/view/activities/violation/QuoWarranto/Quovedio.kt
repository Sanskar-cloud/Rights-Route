package com.example.myapplication.view.activities.violation.QuoWarranto

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.core.content.ContextCompat
import com.example.myapplication.R
import com.example.myapplication.view.activities.violation.web2

class quovedio : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quovedio)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val actionBar = supportActionBar
        actionBar?.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(this,
            R.color.nav_color
        )))

        webView = findViewById(R.id.webView4)

        // Enable JavaScript
        webView.webViewClient = WebViewClient()

        // this will load the url of the website
        webView.loadUrl("https://www.youtube.com/watch?v=GnuH59hQWfw&t=3s")

        // this will enable the javascript settings, it can also allow xss vulnerabilities
        webView.settings.javaScriptEnabled = true

        // if you want to enable zoom feature
        webView.settings.setSupportZoom(true)

        val button = findViewById<Button>(R.id.web)
        button.setOnClickListener{
            val intent = Intent(this, web2::class.java)
            startActivity(intent)
        }


    }

    // if you press Back button this code will work
    override fun onBackPressed() {
        // if your webview can go back it will go back
        if (webView.canGoBack())
            webView.goBack()



        else
            super.onBackPressed()
    }
}