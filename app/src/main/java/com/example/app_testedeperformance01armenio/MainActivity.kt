package com.example.app_testedeperformance01armenio

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById(R.id.editTextTextPersonName) as EditText
        val num2 = findViewById(R.id.editTextTextPersonName2) as EditText
        val tot = findViewById(R.id.editTextTextPersonName3) as EditText
        val bt1 = findViewById(R.id.button) as Button


        bt1.setOnClickListener {
            val val1 = num1.text.toString().toFloat();
            val val2 = num2.text.toString().toFloat();

            val result = val1 + val2



            tot.setText(result.toString())



        }



    }
}