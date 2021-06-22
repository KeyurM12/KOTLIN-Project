package com.example.mykotlin1

class DataManager {
    var courses = HashMap<String,CourseInfo>()
    var notes = ArrayList<NoteInfo>()

    init{
        initCourse()
    }

    private fun initCourse()
    {
        var course = CourseInfo("sonet2021-kotlin","Android Development with Kotlin")
        courses.set(course.courseID,course)

        course = CourseInfo("sonet2021-kotlin-activity","Android Development with Kotlin and Java?")
        courses.set(course.courseID,course)

    }
}