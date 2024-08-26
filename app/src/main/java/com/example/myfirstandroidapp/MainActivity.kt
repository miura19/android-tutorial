package com.example.myfirstandroidapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnDog = findViewById<Button>(R.id.btnDog)
        val btnCat = findViewById<Button>(R.id.btnCat)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val textView = findViewById<TextView>(R.id.textView)

        btnDog.setOnClickListener {
            textView.text = "いぬ"
        }

        btnCat.setOnClickListener {
            textView.text = "ねこ"
        }

        btnClear.setOnClickListener {
            textView.text = "..."
        }
    }
}