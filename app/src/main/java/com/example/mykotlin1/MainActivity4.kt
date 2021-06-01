package com.example.mykotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity4 : AppCompatActivity() {
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
            var res:Int = 0
            var oper:String = spinner1.selectedItem.toString()
            when(oper) {
                "+" -> res = num1 + num2
                "-" -> res = num1 - num2
                "x" -> res = num1 * num2
                "/" -> if (num2 == 0) {res = 0} else {res = num1/num2}
                "%" -> if (num2 == 0) {res = 0} else {res = num1%num2}

            }
            result.text = "Result is : $res"

        })

    }
}