package com.example.quizzapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Corrected method name: setOnClickListener
        val BtnOrder = findViewById<Button>(R.id.btnOrder)
        BtnOrder.setOnClickListener {
            // Your code for handling button click goes here
            val checkedMeatRadiobuttonId=rgMeat.checkedRadioButtonId
            val meat=findViewById<Button>(R.id.checkedMeatRadiobuttonId)
            val cheese=cbCheese.ischecked
            val onions=cbOnion.ischecked
            val salads=cbSalad.ischecked
             val orderString="You ordered a burgr with:\n"+
                     "${meat.text}"+
                     (if(cheese) "\nCheese" else "")+
                     (if(onions) "\nonions" else "")+
                     (if(salads) "\nSalad" else "")
            tvOrder.text=orderString
        }
    }
}
