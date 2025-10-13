package com.study.goodwords

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.study.goodwords.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("가는 말이 고우면 얕본다.")
        sentenceList.add("세번 참으면 호구된다.")
        sentenceList.add("늦었다고 생각할 때가 진짜 너무 늦었다. 그러니 당장 시작해!")
        sentenceList.add("일찍 일어나는 새가 피곤하다.")
        sentenceList.add("엉망으로 살아야해, 인생은 한 번이야!")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSentenceButton.setOnClickListener {
            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }
        binding.goodWordTextArea.setText(sentenceList.random())
    }
}