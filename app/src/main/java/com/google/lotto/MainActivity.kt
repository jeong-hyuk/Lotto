package com.google.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

fun getShuffledLottoNumbers () : MutableList<Int>{
    var list = mutableListOf<Int>()

    for(number in 1..45){
        list.add(number)
    }
    list.shuffle()

    return list.subList(0, 6)
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardRandom = findViewById<CardView>(R.id.cardRandom)
        cardRandom.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
             intent.putIntegerArrayListExtra("result", ArrayList(getRandomLottoNumbers()))
            startActivity(intent)
        }
        val cardConstell = findViewById<CardView>(R.id.cardConstell)
        cardConstell.setOnClickListener {
            startActivity(Intent(this, ConstellationActivity::class.java))
        }
        val cardName = findViewById<CardView>(R.id.cardName)
        cardName.setOnClickListener {
            startActivity(Intent(this, NameActivity::class.java))
        }
    }



    fun getRandomLottoNumber():Int{
        return java.util.Random().nextInt(45)+1
    }
    fun getRandomLottoNumbers(): MutableList<Int>{
        val lottoNumbers = mutableListOf<Int>()

    while(true){
        var number:Int = getRandomLottoNumber()
       // var flag_existing: Int = 0
      //  for(j in 0..lottoNumbers.size){
        if(lottoNumbers.contains(number)){
    //        if(number.equals(lottoNumbers[j])){
    //            flag_existing =1
             //   break;
            continue

        }
//        if(flag_existing.equals(1))
//            continue
//        else
            lottoNumbers.add(number)
        if(lottoNumbers.size >= 6)
            break;
    }
        return lottoNumbers

    }
}