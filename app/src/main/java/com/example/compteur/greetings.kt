package com.example.compteur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class greetings : AppCompatActivity() {
    lateinit var textView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greetings)
        val monNom = intent.extras?.get("nom").toString()

        textView = findViewById(R.id.salut)
        textView.text = "Mbote "+ monNom
    }
}