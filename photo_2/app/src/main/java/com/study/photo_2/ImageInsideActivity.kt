package com.study.photo_2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        val getData = intent.getStringExtra("data")
        val oriImage = findViewById<ImageView>(R.id.oriImageArea)

        //Toast.makeText(this, getData, Toast.LENGTH_LONG).show()

        if (getData == "1") {
            oriImage.setImageResource(R.drawable.ori1)
        }

        if (getData == "2") {
            oriImage.setImageResource(R.drawable.ori2)
        }

        if (getData == "3") {
            oriImage.setImageResource(R.drawable.ori3)
        }

        if (getData == "4") {
            oriImage.setImageResource(R.drawable.ori4)
        }

        if (getData == "5") {
            oriImage.setImageResource(R.drawable.ori5)
        }

        if (getData == "6") {
            oriImage.setImageResource(R.drawable.ori6)
        }

        if (getData == "7") {
            oriImage.setImageResource(R.drawable.ori7)
        }

        if (getData == "8") {
            oriImage.setImageResource(R.drawable.ori8)
        }

        if (getData == "9") {
            oriImage.setImageResource(R.drawable.ori9)
        }

    }
}