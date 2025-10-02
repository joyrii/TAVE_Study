package com.study.val_log

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val test = "여기는 텍스트입니당"

        Log.e("MainActivity", test) //오류
        Log.w("MainActivity", test) //경고
        Log.i("MainActivity", test) //정보
        Log.d("MainActivity", test) //디버그
        Log.v("MainActivity", test) //상세

    }
}