package com.example.birthdaycardapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupToolbar()

    }

    override fun onStart() {
        super.onStart()
    }
    private fun setupToolbar() {
        val toolBar = findViewById<Toolbar>(R.id.tool_bar)
    }
}