package com.example.mykotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val btn1 = findViewById<Button>(R.id.btn1_ma6)
        val input_name = findViewById<EditText>(R.id.name_ma6)
        val input_gender = findViewById<EditText>(R.id.gen_ma6)
        val input_age = findViewById<EditText>(R.id.age_ma6)
        var result = findViewById<TextView>(R.id.txtv1_ma6)

        btn1.setOnClickListener(View.OnClickListener {
            val person = Person()
            person.name = input_name.text.toString()
            person.age = input_age.text.toString().toInt()

            var res:String? = "${if(person.age!=0) person.name else "Person is Minor"}"

            result.text = res

            Toast.makeText(this, res, Toast.LENGTH_LONG).show()
        })

    }
}