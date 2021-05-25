package com.google.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)

        button.setOnClickListener {
            startActivity(Intent(this@NameActivity, ConstellationActivity::class.java))
        }
        button2.setOnClickListener {
            startActivity(Intent(this@NameActivity, ConstellationActivity::class.java))
        }
    }
}