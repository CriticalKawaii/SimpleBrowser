package com.example.simplebrowser

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

class BrowserActivity : ComponentActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.browser);

    WebView webView = (WebView) findViewById(R.id.webView);
    webView.setWebViewClient(new WebViewClient());
    Uri data = getIntent().getData();
    webView.loadUrl(data.toString());
  }
}