package com.example.compteur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var buttonAction : Button
    lateinit var counterTextView : TextView

    var count : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAction = findViewById(R.id.buttonAction)
        counterTextView = findViewById(R.id.counter)

        buttonAction.setOnClickListener {
            count +=1
            counterTextView.text = count.toString()
        }
    }
}