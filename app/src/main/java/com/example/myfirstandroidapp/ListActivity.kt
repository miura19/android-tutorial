package com.example.myfirstandroidapp

import android.os.Bundle
import android.widget.ArrayAdapter
//import android.widget.ListAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.ArrayList

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val lv:ListView = findViewById(R.id.listView)

        val data: ArrayList<String> = arrayListOf(
            "ライオン","クマ","キリン","ゾウ","パンダ","コアラ","キリン","サル","ヒョウ",
            "ゴリラ","カバ","カピバラ","リス","ワニ","ハムスター","ヒツジ","ネコ","タスマニアデビル",
            "デグー","ヤンバルクイナ","タランチュラ"
        )

        val adapter = ArrayAdapter (
            this,
            android.R.layout.simple_list_item_1,
            data
        )

        lv.adapter = adapter
    }
}