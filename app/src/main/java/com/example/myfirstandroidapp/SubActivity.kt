package com.example.myfirstandroidapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sub)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnTop = findViewById<Button>(R.id.btnTop)
        val playFortune = findViewById<Button>(R.id.playFortune)
        val yourFortuneIs = findViewById<TextView>(R.id.yourFortuneIs)


        btnTop.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        playFortune.setOnClickListener {
            yourFortuneIs.text = "大吉！！！"
        }
    }
}