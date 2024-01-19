package com.example.quizzapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Corrected method name: setOnClickListener
        val BtnOrder = findViewById<Button>(R.id.btnOrder)
        BtnOrder.setOnClickListener {
            // Your code for handling button click goes here
            val rgMeat=findViewById<RadioGroup>(R.id.rgMeat)
            val checkedMeatRadiobuttonId=rgMeat.checkedRadioButtonId
            val meat=findViewById<RadioButton>(checkedMeatRadiobuttonId)
            val cheese=findViewById<CheckBox>(R.id.cbCheese).isChecked
            val onions=findViewById<CheckBox>(R.id.cbOnion).isChecked
            val salads=findViewById<CheckBox>(R.id.cbSalad).isChecked
            val tvOrder=findViewById<TextView>(R.id.tvOrder)
            val orderString="You ordered a burgr with:\n"+
                    "${meat.text}"+
                    (if(cheese) "\nCheese" else "")+
                    (if(onions) "\nonions" else "")+
                    (if(salads) "\nSalad" else "")
            tvOrder.text=orderString
        }
    }
}

