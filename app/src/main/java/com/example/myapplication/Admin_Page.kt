package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Admin_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_page)
        val suButton = findViewById<Button>(R.id.submitBtn)
        val loText = findViewById<TextView>(R.id.loginTv)

        suButton.setOnClickListener {
            val submitIntent = Intent (this,DashBoard::class.java)
            startActivity(submitIntent)
        }
        loText.setOnClickListener {
            val loginIntent = Intent(this, DashBoard::class.java)
            startActivity(loginIntent)

        }

    }
}