package com.google.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getIntegerArrayListExtra("result")?:return
//        if(result == null) {
//            return
//        }
//
//        println("result is $result")
//        result.sort()
//        println("result sorted is $result")
//
//         val result_sorted = result.sortedBy { it }
//          val result_sorted = result?.sorted()
//        println("result_sorted is " + result_sorted)
        updateLottoBallImages(result.sortedBy { it })

        }

    private fun updateLottoBallImages(result_sorted : List<Int>) {
        val lottoBallImageStartId = R.drawable.ball_01
//        val LottoBallImageId2 = R.drawable.ball_02
//        val LottoBallImageId3 = R.drawable.ball_03
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)
        val imageView6 = findViewById<ImageView>(R.id.imageView6)
        val imageView8 = findViewById<ImageView>(R.id.imageView8)
        val imageView9 = findViewById<ImageView>(R.id.imageView9)

        imageView2.setImageResource(lottoBallImageStartId + result_sorted!![0] - 1)
        imageView3.setImageResource(lottoBallImageStartId + result_sorted[1] - 1)
        imageView4.setImageResource(lottoBallImageStartId + result_sorted[2] - 1)
        imageView6.setImageResource(lottoBallImageStartId + result_sorted[3] - 1)
        imageView8.setImageResource(lottoBallImageStartId + result_sorted[4] - 1)
        imageView9.setImageResource(lottoBallImageStartId + result_sorted[5] - 1)

    }
}