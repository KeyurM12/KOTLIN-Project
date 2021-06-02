package com.example.mykotlin1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity4 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val btn = findViewById<Button>(R.id.resbtn1)
        val input_num1 = findViewById<EditText>(R.id.num1)
        val input_num2 = findViewById<EditText>(R.id.num2)
        val spinner1 = findViewById<Spinner>(R.id.op_spn)
        val result = findViewById<TextView>(R.id.restxt)

        btn.setOnClickListener(View.OnClickListener {
            var num1 = input_num1.text.toString().toInt()
            var num2 = input_num2.text.toString().toInt()
            var res:String = ""
            var oper:String = spinner1.selectedItem.toString()
            when(oper) {
                "+" -> res = "${add(num1,num2)}"
                "-" -> res = "${sub(num1,num2)}"
                "x" -> res = "${mul(num1,num2)}"
                "/" -> res = "${div(num1,num2)}"
                "%" -> res = "${mod(num1,num2)}"

            }
            result.text = "Result is : $res"

        })
    }
}
fun add(a:Int, b:Int): Int {
    return a+b
}
fun sub(a:Int, b:Int): Int {
    return a-b
}
fun mul(a:Int, b:Int): Int {
    return a*b
}
fun div(a:Int, b:Int): Int {
    if(b==0) return 0
    return a/b
}
fun mod(a:Int, b:Int): Int {
    if(b==0) return 0
    return a%b
}