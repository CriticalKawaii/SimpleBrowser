package com.example.simplebrowser

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.core.net.toUri

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)

    val btnWeb: Button = findViewById(R.id.btnWeb)
    btnWeb.setOnClickListener {
      val intent = Intent(Intent.ACTION_VIEW, "http://www.ya.ru".toUri())
      startActivity(intent)
    }
  }
}