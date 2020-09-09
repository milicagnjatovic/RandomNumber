package com.example.randomnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randomBtn.setOnClickListener(){
            val lim = limitSB.progress
            val random: Random = Random()
            textView.text = random.nextInt(lim).toString()
        }
    }
}
