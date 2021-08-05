package com.example.mykotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class NoteTakingScreen2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_taking_screen2)

        var dm = DataManager()
        var adapterOfCourses = ArrayAdapter<CourseInfo>(this,android.R.layout.simple_spinner_item,dm.courses.values.toList())
        adapterOfCourses.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        var spinner = findViewById<Spinner>(R.id.spinner_nts)
        spinner.adapter = adapterOfCourses;

    }
}