package com.google.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
        val btnGoResultName = findViewById<Button>(R.id.btnGoResultName)
        val btnBack = findViewById<Button>(R.id.btnBack)

        btnGoResultName.setOnClickListener {
            startActivity(Intent(this@NameActivity, ConstellationActivity::class.java))
        }
        btnBack.setOnClickListener {
            startActivity(Intent(this@NameActivity, ConstellationActivity::class.java))
        }
    }
}