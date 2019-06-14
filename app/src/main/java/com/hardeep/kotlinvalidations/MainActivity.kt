package com.hardeep.kotlinvalidations

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var result : TextView ?= null
    var num1 : EditText ?= null
    var num2 : EditText ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result = findViewById(R.id.result)
        num1 = findViewById(R.id.number1)
        num2 = findViewById(R.id.number2)
    }

    fun add(v:View)
    {
        if (num1!!.text.toString().isEmpty())
        {
            num1!!.setError("Enter number here")
        }
        else
        {
            val a = num1!!.text.toString().toInt()
            val b = num2!!.text.toString().toInt()
            val c = a + b

            result!!.text = c.toString()
        }
    }
}
