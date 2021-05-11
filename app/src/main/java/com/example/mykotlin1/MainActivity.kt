package com.example.mykotlin1

import androidx.appcompat.app.AppCompatActivity
import android.R.attr.button
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txt1 = findViewById<TextView>(R.id.txt1)
        var txt2 = findViewById<TextView>(R.id.txt2)
        var btn = findViewById<Button>(R.id.button2)
        var input_radius = findViewById<TextView>(R.id.input_radius)

        btn.setOnClickListener(View.OnClickListener{
            var radius = 0.0
            val pi = 3.1415
            radius = input_radius.text.toString().toDouble()

            var area = pi*radius*radius

            txt1.text = "Area of the Circle is $area"


        })


    }


}