package com.example.mykotlin1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class QuizActivity : AppCompatActivity(),View.OnClickListener {

    private var listOfsimpleQuestions:ArrayList<simpleQuestions>? = null
    var currentPos= 0
    lateinit var questions:TextView
    lateinit var opt1:TextView
    lateinit var opt2:TextView
    lateinit var opt3:TextView
    lateinit var opt4:TextView
    lateinit var submitBtn:Button

    var selectedChoice = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        var util:Utility = Utility()
        listOfsimpleQuestions = util.getQuestions()

        var name: String? = intent.getStringExtra("name")
        var q_name = findViewById<TextView>(R.id.textView1_aq)
        q_name.text = name



        questions = findViewById<TextView>(R.id.textView_aq)
        opt1 = findViewById<TextView>(R.id.textView21)
        opt2 = findViewById<TextView>(R.id.textView22)
        opt3 = findViewById<TextView>(R.id.textView23)
        opt4 = findViewById<TextView>(R.id.textView24)
        submitBtn = findViewById<Button>(R.id.btn_next_aq)

        submitBtn.setOnClickListener(View.OnClickListener {
            var ans = listOfsimpleQuestions!!.get(currentPos).answer

            checkAnswer(ans,selectedChoice)

        })

        setQuestions()

        opt1.setOnClickListener(this)
        opt2.setOnClickListener(this)
        opt3.setOnClickListener(this)
        opt4.setOnClickListener(this)

    }

    private fun checkAnswer(ans:Int,id:Int)
    {
        if(ans == id)
        {
            Toast.makeText(this,"Correct",Toast.LENGTH_SHORT).show()
        }
        else
            Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show()
    }

    fun setQuestions()
    {
        var quesObj = listOfsimpleQuestions!!.get(currentPos)
        questions.text = quesObj.question
        opt1.text = quesObj.optOne
        opt2.text = quesObj.optTwo
        opt3.text = quesObj.optThree
        opt4.text = quesObj.optFour
    }

    override fun onClick(v:View)
    {
        defaultOption()
        when(v.id)
        {

            R.id.textView21 -> selectedOption(opt1,1)
            R.id.textView22 -> selectedOption(opt2,2)
            R.id.textView23 -> selectedOption(opt3,3)
            R.id.textView24 -> selectedOption(opt4,4)
        }

    }

    private fun selectedOption(ts:TextView,ch:Int)
    {
        ts.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)
        selectedChoice = ch
    }

    private fun defaultOption()
    {
        opt1.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        opt2.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        opt3.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        opt4.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
    }

}