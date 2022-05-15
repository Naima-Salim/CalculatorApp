
package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorApp : AppCompatActivity() {
    lateinit var btnAdd: Button
    lateinit var btnMultiply: Button
    lateinit var btnSubtract: Button
    lateinit var btnModulus: Button
    lateinit var etFirstNumber: EditText
    lateinit var etSecondNumber: EditText
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_app)

       btnAdd=findViewById(R.id.btnAdd)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnModulus=findViewById(R.id.btnModulus)
        etFirstNumber=findViewById(R.id.etFirstNumber)
        etSecondNumber=findViewById(R.id.etSecondNumber)
        tvResult=findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
        val firstNumber=etFirstNumber.text.toString()
        val secondNumber=etSecondNumber.text.toString()
            if (firstNumber.isBlank()) {
                etFirstNumber.setError("number is required")
                return@setOnClickListener
            }
            if (secondNumber.isBlank()){
                etSecondNumber.setError("number is required")
                return@setOnClickListener
            }
            addition(firstNumber.toInt(),secondNumber.toInt())

        }

        btnMultiply.setOnClickListener {
            val firstNumber=etFirstNumber.text.toString()
            val secondNumber=etSecondNumber.text.toString()
            if (firstNumber.isBlank()) {
                etFirstNumber.setError("Number is required")
                return@setOnClickListener
            }
            if (secondNumber.isBlank()){
                tvResult.text=""
                etSecondNumber.setError("Number is required")
                return@setOnClickListener
            }
            multiplication(firstNumber.toInt(), secondNumber.toInt())
        }

        btnSubtract.setOnClickListener {
            val firstNumber=etFirstNumber.text.toString()
            val secondNumber=etSecondNumber.text.toString()
            if (firstNumber.isBlank()) {
                etFirstNumber.setError("Number is required")
                return@setOnClickListener
            }
            if (secondNumber.isBlank()){
                etSecondNumber.setError("Number is required")
                return@setOnClickListener
            }
            subtraction(firstNumber.toInt(), secondNumber.toInt())
        }

        btnModulus.setOnClickListener {
            val firstNumber=etFirstNumber.text.toString()
            val secondNumber=etSecondNumber.text.toString()
            if (firstNumber.isBlank()) {
                etFirstNumber.setError("Number is required")
                return@setOnClickListener
            }
            if (secondNumber.isBlank()){
                etSecondNumber.setError("Number is required")
                return@setOnClickListener
            }
            modulus(firstNumber.toInt(), secondNumber.toInt())
        }

    }
    fun addition(firstNumber:Int, secondNumber:Int){
        var add=firstNumber+secondNumber
        tvResult.text=add.toString()
    }
    fun multiplication(firstNumber:Int, secondNumber:Int){
        var multiply=firstNumber*secondNumber
        tvResult.text=multiply.toString()
    }
    fun subtraction(firstNumber: Int, secondNumber: Int){
        var subtract=firstNumber-secondNumber
        tvResult.text=subtract.toString()
    }
    fun modulus(firstNumber: Int, secondNumber: Int){
        var quotient=firstNumber%secondNumber
        tvResult.text=quotient.toString()
    }
}