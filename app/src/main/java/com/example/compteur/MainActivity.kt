package com.example.compteur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var buttonAction : Button
    lateinit var counterTextView : TextView
    lateinit var buttonPlus : Button

    var count : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAction = findViewById(R.id.buttonAction)
        counterTextView = findViewById(R.id.counter)
        buttonPlus = findViewById(R.id.buttonPlus)

        buttonAction.setOnClickListener {
            count +=1
            counterTextView.text = count.toString()
        }

        buttonPlus.setOnClickListener {
            val intent: Intent = Intent (this, greetings::class.java)
            intent.putExtra("nom", "John Kalombo")
            startActivity(intent)
        }
    }
}
