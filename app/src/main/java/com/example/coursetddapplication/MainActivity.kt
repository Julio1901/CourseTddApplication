package com.example.coursetddapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.coursetddapplication.common.Calculator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val ptFirstNumber : TextView = findViewById(R.id.pt_first_number_home)
        val ptSecondNumber : TextView = findViewById(R.id.pt_second_number_home)
        val btnDisplayResult : Button = findViewById(R.id.btn_display_result_home)
        val tvResult : TextView = findViewById(R.id.tv_result_home)

        val calculatorInstance = Calculator()


        btnDisplayResult.setOnClickListener {
            val firstNumber = ptFirstNumber.text.toString().toInt()
            val secondNumber =  ptSecondNumber.text.toString().toInt()

            val result = calculatorInstance.sumTwoValues(firstNumber , secondNumber)

            tvResult.text = result.toString()
        }



    }


}