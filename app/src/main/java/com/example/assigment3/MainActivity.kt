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
        //Setting variables
        var counter = 1
        val counterButton = findViewById<Button>(R.id.CounterButton)
        val counterText = findViewById<TextView>(R.id.Counter)
        val statusText = findViewById<TextView>(R.id.CounterStatus)
        val checkBox = findViewById<CheckBox>(R.id.checkBox)

        checkBox.setOnClickListener {
            if (checkBox.isChecked) {
                //If checkbox is checked then button will be enabled and texts changed
                checkBox.text="Uncheck to reset"
                counterButton.isClickable = true
                statusText.text = "Button is now clickable"
                counterButton.text = "Click to increase"
            } else {
                //If chackbox is not checked then button will not be clickable and text changed
                counter= 1
                counterText.text = "${counter}"
                counterButton.isClickable = false
                statusText.text = "Button is not clickable"
                counterButton.text = "Button is not clickable"
            }
        }
        counterButton.setOnClickListener {
            //If button clicked counter will increase and text changed
            counter *= 5
            counterText.text = "${counter}"

        }

    }
}