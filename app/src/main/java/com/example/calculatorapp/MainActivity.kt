package com.example.calculatorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity(){
    lateinit var btnCalculateApp:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculateApp=findViewById(R.id.btnCalculate)
        btnCalculateApp.setOnClickListener {
            val intent = Intent(this, CalculatorApp::class.java)
            startActivity(intent)
        }
    }
}