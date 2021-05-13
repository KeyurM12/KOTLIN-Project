package com.example.mykotlin1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Spinner
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var layout = findViewById<ConstraintLayout>(R.id.container)
        var spinner1 = findViewById<Spinner>(R.id.spinner1)
        var btn1 = findViewById<Button>(R.id.color_btn)

        btn1.setOnClickListener(View.OnClickListener {
            var color:String = spinner1.selectedItem.toString()
            when(color)
            {
                "Red" -> layout.setBackgroundColor(Color.RED)
                "Blue" -> layout.setBackgroundColor(Color.BLUE)
                "Yellow" -> layout.setBackgroundColor(Color.YELLOW)
                "Green" -> layout.setBackgroundColor(Color.GREEN)
            }

        })

    }
}