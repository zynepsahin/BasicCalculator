package com.zeynepsahin.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var number1 : Int? = null
    var number2 : Int? = null
    var result : Int? = null
    lateinit var resulText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum(view : View) {

        number1 = findViewById<EditText>(R.id.editText).text.toString().toIntOrNull()
        number2 = findViewById<EditText>(R.id.editText2).text.toString().toIntOrNull()
        var resultText = findViewById<TextView>(R.id.resultText)


        if (number1 == null || number2 == null)
            resultText.setText("Error!")
        else {
            var result = number1!! + number2!!
            resultText.setText("Result: $result")
        }
    }
    fun substract(view: View) {

        number1 = findViewById<EditText>(R.id.editText).text.toString().toIntOrNull()
        number2 = findViewById<EditText>(R.id.editText2).text.toString().toIntOrNull()
        var resultText = findViewById<TextView>(R.id.resultText)


        if (number1 == null || number2 == null)
            resultText.setText("Error!")
        else {
            var result = number1!! - number2!!
            resultText.setText("Result: $result")
        }
    }
    fun multiply(view: View) {

        number1 = findViewById<EditText>(R.id.editText).text.toString().toIntOrNull()
        number2 = findViewById<EditText>(R.id.editText2).text.toString().toIntOrNull()
        var resultText = findViewById<TextView>(R.id.resultText)


        if (number1 == null || number2 == null)
            resultText.setText("Error!")
        else {
            var result = number1!! * number2!!
            resultText.setText("Result: $result")
        }
    }
    fun divide(view: View) {

        number1 = findViewById<EditText>(R.id.editText).text.toString().toIntOrNull()
        number2 = findViewById<EditText>(R.id.editText2).text.toString().toIntOrNull()
        var resultText = findViewById<TextView>(R.id.resultText)


        if (number1 == null || number2 == null)
            resultText.setText("Error!")
        else {
            var result = number1!! / number2!!
            resultText.setText("Result: $result")
        }
    }
}