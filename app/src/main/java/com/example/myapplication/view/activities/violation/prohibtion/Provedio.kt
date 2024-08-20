package com.example.myapplication.view.activities.violation.prohibtion

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.content.ContextCompat
import com.example.myapplication.R

class provedio : AppCompatActivity() {


    private lateinit var webView: WebView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_provedio)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val actionBar = supportActionBar
        actionBar?.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(this,
            R.color.nav_color
        )))

        webView = findViewById(R.id.provedio)

        // Enable JavaScript
        webView.webViewClient = WebViewClient()

        // this will load the url of the website
        webView.loadUrl("https://www.youtube.com/watch?v=eZWN-bB5Of4&t=97s")

        // this will enable the javascript settings, it can also allow xss vulnerabilities
        webView.settings.javaScriptEnabled = true

        // if you want to enable zoom feature
        webView.settings.setSupportZoom(true)
    }
}