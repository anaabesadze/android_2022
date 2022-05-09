package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class Activity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        var msg = ""

        if (intent.getStringExtra("extra_text") != null) {
            msg = intent.getStringExtra("extra_text")!!
        }

        if (!msg.equals(""))
            findViewById<TextView>(R.id.textView).text = "Hello, $msg"

        val imgClick = findViewById<ImageButton>(R.id.imageButton2)
        imgClick.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}