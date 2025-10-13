package com.study.goodwords

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList =mutableListOf<String>()
        sentenceList.add("가는 말이 고우면 얕본다.")
        sentenceList.add("세번 참으면 호구된다.")
        sentenceList.add("늦었다고 생각할 때가 진짜 너무 늦었다. 그러니 당장 시작해!")
        sentenceList.add("일찍 일어나는 새가 피곤하다.")
        sentenceList.add("엉망으로 살아야해, 인생은 한 번이야!")

        val sentenceAdapter = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceAdapter

    }
}