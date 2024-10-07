package com.example.birthdaycardapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.caculator_constraintlayout_frag)
        setupToolbar()
    }

    override fun onStart() {
        super.onStart()
    }
    private fun setupToolbar() {
        val toolBar = findViewById<Toolbar>(R.id.tool_bar)
        toolBar.title = "LifeCycle"
        toolBar.setTitleTextColor(this.getColor(R.color.white))
//        toolBar.setLogo(R.drawable.record)
    }
}