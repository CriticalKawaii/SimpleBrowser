package com.example.simplebrowser

import android.net.Uri
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity

class BrowserActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?){
    super.onCreate(savedInstanceState)
    setContentView(R.layout.browser)

    val webView: WebView = findViewById(R.id.webView)
    webView.webViewClient = WebViewClient()
    webView.settings.javaScriptEnabled = true

    val data: Uri? = intent.data
    data?.let {webView.loadUrl(it.toString())}
  }
}