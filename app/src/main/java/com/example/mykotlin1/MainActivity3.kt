package com.example.mykotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var txt1 = findViewById<TextView>(R.id.txt)
        var btn = findViewById<Button>(R.id.btn)
        var input_num = findViewById<EditText>(R.id.NumInput)
        btn.setOnClickListener(View.OnClickListener {
            var i = 1
            var str:String =""
            var num = input_num.text.toString().toInt()
            while(true)
            {
                if(i==num)
                {
                    str+="$i"
                    break;
                }
                str+="$i@"
                i++
            }
            txt1.text=str
        })



    }
}