package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgClick = findViewById<ImageView>(R.id.imageView1)
        imgClick.setOnClickListener{
            val intent = Intent(this, Activity::class.java)
            startActivity(intent)
        }

        val passText = findViewById<ImageButton>(R.id.imageButton)
        passText.setOnClickListener{
            val intent = Intent(this, Activity::class.java)
            val userText = findViewById<EditText>(R.id.editText).text.toString()
            intent.putExtra("extra_text", userText)
            startActivity(intent)
        }
    }
}