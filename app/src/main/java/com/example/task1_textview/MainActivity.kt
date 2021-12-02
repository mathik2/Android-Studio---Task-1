package com.example.task1_textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val OutputDisplayTextView = findViewById<TextView>(R.id.FourthTextView)
        val FirstClickButton =  findViewById<TextView>(R.id.FirstTextView)
        val SecondClickButton =  findViewById<TextView>(R.id.SecondTextView)
        val ThirdClickButton =  findViewById<TextView>(R.id.ThirdTextView)

        FirstClickButton.setOnClickListener{

            OutputDisplayTextView.text ="Red was Clicked "

        }

        SecondClickButton.setOnClickListener{

            OutputDisplayTextView.text ="Green was Clicked "
        }

        ThirdClickButton.setOnClickListener{

            OutputDisplayTextView.text ="Blue was Clicked "
        }

    }
}