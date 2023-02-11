package com.loureiro.msu.countingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var button : Button                 //variable for the button
    private lateinit var counter : TextView              //variable for the text display counter
    var clicks = 0                                       //variable to store the clicks and display the right number

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        counter = findViewById(R.id.increment_counter)

        button.setOnClickListener{                //Listens for the clicks and turns the counter to String to display the number
            counter.text = clicks.toString()
            clicks += 1                                  //Adds 1 to the previous number

        }

    }
}