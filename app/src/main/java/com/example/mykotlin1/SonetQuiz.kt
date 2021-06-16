package com.example.mykotlin1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SonetQuiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonet_quiz)
        
        var q_btn = findViewById<Button>(R.id.btn1_sq)
        var q_name = findViewById<EditText>(R.id.et1_sq)

        q_btn.setOnClickListener(View.OnClickListener {
            if(q_name.text.toString().isEmpty())
            {
                Toast.makeText(this,"Please Enter a Name",Toast.LENGTH_LONG).show()
            } else
            {
                var next:Intent = Intent(this,QuizActivity()::class.java)
                startActivity(next)
                finish()

            }


        })
        
    }
}