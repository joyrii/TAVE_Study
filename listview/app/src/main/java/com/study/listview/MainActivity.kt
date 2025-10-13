package com.study.listview

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //리스트 생성
        val list_item = mutableListOf<ListViewModel>()

        list_item.add(ListViewModel("a", "b"))
        list_item.add(ListViewModel("c", "d"))
        list_item.add(ListViewModel("e", "f"))

        val listview = findViewById<ListView>(R.id.mainListView)

        //리스트를 어댑터로 전달
        val listAdapter = ListViewAdapter(list_item)
        //어댑터가 리스트 아이템 생성하도록 연결
        listview.adapter = listAdapter

    }
}