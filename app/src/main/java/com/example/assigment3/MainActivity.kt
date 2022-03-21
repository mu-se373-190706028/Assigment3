package com.example.assigment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter = 1
        val counterButton = findViewById<Button>(R.id.CounterButton)
        val counterText = findViewById<TextView>(R.id.Counter)
        val statusText = findViewById<TextView>(R.id.CounterStatus)
        val checkBox = findViewById<CheckBox>(R.id.checkBox)

        checkBox.setOnClickListener {
            if (checkBox.isChecked) {
                checkBox.text="Uncheck to reset"
                counterButton.isClickable = true
                statusText.text = "Button is now clickable"
                counterButton.text = "Click to increase"
            } else {
                counter= 1
                counterText.text = "${counter}"
                counterButton.isClickable = false
                statusText.text = "Button is not clickable"
                counterButton.text = "Button is not clickable"
            }
        }
        counterButton.setOnClickListener {
            counter *= 5
            counterText.text = "${counter}"

        }

    }
}