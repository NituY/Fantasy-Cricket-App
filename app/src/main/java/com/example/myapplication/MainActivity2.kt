package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val userButton = findViewById<Button>(R.id.UsBtn)
        val adminButton = findViewById<Button>(R.id.AdBtn)
        userButton.setOnClickListener {
            val userIntent = Intent(this,User_Page::class.java)
            startActivity(userIntent)
        }
        adminButton.setOnClickListener {
            val adminIntent = Intent(this,Admin_Page::class.java)
            startActivity(adminIntent)
        }

    }
}