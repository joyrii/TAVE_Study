package com.study.photo_1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. 화면 클릭
        val image1 = findViewById<ImageView>(R.id.ori_1)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()
            //2. 다음 화면 - 사진 확대
            val intent = Intent(this, Ori1Activity::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.ori_2)
        image2.setOnClickListener {
            Toast.makeText(this, "2번 클릭 완료", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Ori2Activity::class.java)
            startActivity(intent)
        }

        val image3 = findViewById<ImageView>(R.id.ori_3)
        image3.setOnClickListener {
            Toast.makeText(this, "3번 클릭 완료", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Ori3Activity::class.java)
            startActivity(intent)
        }

        val image4 = findViewById<ImageView>(R.id.ori_4)
        image4.setOnClickListener {
            Toast.makeText(this, "4번 클릭 완료", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Ori4Activity::class.java)
            startActivity(intent)
        }

        val image5 = findViewById<ImageView>(R.id.ori_5)
        image5.setOnClickListener {
            Toast.makeText(this, "5번 클릭 완료", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Ori5Activity::class.java)
            startActivity(intent)
        }

        val image6 = findViewById<ImageView>(R.id.ori_6)
        image6.setOnClickListener {
            Toast.makeText(this, "6번 클릭 완료", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Ori6Activity::class.java)
            startActivity(intent)
        }

        val image7 = findViewById<ImageView>(R.id.ori_7)
        image7.setOnClickListener {
            Toast.makeText(this, "7번 클릭 완료", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Ori7Activity::class.java)
            startActivity(intent)
        }

    }
}