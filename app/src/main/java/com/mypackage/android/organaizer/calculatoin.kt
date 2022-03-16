package com.mypackage.android.organaizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_calculatoin.*
import net.objecthunter.exp4j.ExpressionBuilder


class calculatoin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculatoin)
        btn_0.setOnClickListener { setTextFields("0") }
        btn_1.setOnClickListener { setTextFields("1") }
        btn_2.setOnClickListener { setTextFields("2") }
        btn_3.setOnClickListener { setTextFields("3") }
        btn_4.setOnClickListener { setTextFields("4") }
        btn_5.setOnClickListener { setTextFields("5") }
        btn_6.setOnClickListener { setTextFields("6") }
        btn_7.setOnClickListener { setTextFields("7") }
        btn_8.setOnClickListener { setTextFields("8") }
        btn_9.setOnClickListener { setTextFields("9") }
        minus.setOnClickListener { setTextFields("-") }
        plus.setOnClickListener { setTextFields("+") }
        point.setOnClickListener { setTextFields(".") }
        btn_multiplication.setOnClickListener { setTextFields("*") }
        btn_division.setOnClickListener { setTextFields("/") }
        btn_bracket1.setOnClickListener { setTextFields("(") }
        btn_bracket2.setOnClickListener { setTextFields(")") }

        btn_AC.setOnClickListener {
            math_operation.text=""
            result_text.text=""
        }
        back.setOnClickListener {
            val str = math_operation.text.toString()
                if (str.isNotEmpty())
                    math_operation.text = str.substring(0,str.length -1)
            result_text.text = ""
        }
        equal.setOnClickListener {
            try {
                val ex = ExpressionBuilder(math_operation.text.toString()).build()
                val result = ex.evaluate()
                val longRes = result.toLong()
                    if (result == longRes.toDouble())
                        result_text.text = longRes.toString()
                    else
                        result_text.text = result.toString()
            }catch (e:Exception){
                Log.d("ошибка","сообщение:${e.message}")
            }
        }

    }

    fun setTextFields(str:String){
        if (result_text.text != ""){
            math_operation.text = result_text.text
            result_text.text = ""
        }

     //   val mathOperation = findViewById<TextView>(R.id.math_operation)
    math_operation.append(str)
    }
}