package com.example.a3r

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient

class chatarra : AppCompatActivity() {

    // Private

    private val Base_URL = "www.google.com"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_chatarra)

        // webWiew

        webView.WebChromeClient = object : WebChromeClient(){

        }

        webview.webViewClient = object : WebViewClient(){

        }

        val settings = webWiew.settings
        settings.javaScripEnable = true

        android.R.attr.webViewStyle.loadURL(Base_URL)

    }

    override fun onBackPressed() {
        if (webview.canGoBack()){
            webView.goBack()
        } else{
            super.onBackPressed()
        }
    }


}