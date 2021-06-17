package com.example.mykotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class QuizActivity : AppCompatActivity() {
    private var listOfsimpleQuestions:ArrayList<simpleQuestions>? = null
    var currentPos= 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        var util:Utility = Utility()
        listOfsimpleQuestions = util.getQuestions()

        setQuestions()

    }
    fun setQuestions()
    {
        var quesObj = listOfsimpleQuestions!!.get(currentPos)
        var questions = findViewById<TextView>(R.id.textView_aq)
        questions.text = quesObj.question

        var opt1 = findViewById<TextView>(R.id.textView21)
        opt1.text = quesObj.optOne

        var opt2 = findViewById<TextView>(R.id.textView22)
        opt2.text = quesObj.optTwo

        var opt3 = findViewById<TextView>(R.id.textView23)
        opt3.text = quesObj.optThree

        var opt4 = findViewById<TextView>(R.id.textView24)
        opt4.text = quesObj.optFour
    }

}