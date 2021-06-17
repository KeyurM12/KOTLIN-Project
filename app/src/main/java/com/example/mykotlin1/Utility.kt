package com.example.mykotlin1

class Utility {
    fun getQuestions():ArrayList<simpleQuestions>
    {
        var list = ArrayList<simpleQuestions>()
        var q1 = simpleQuestions(1,"What is Kotlin","Scripting Language","Programming language","DeeDee Language","PooPoo Language")
        var q2 = simpleQuestions(2,"What is Java","Scripting Language","Programming language","DeeDee Language","PooPoo Language")

        list.add(q1)
        list.add(q2)

        return list
    }
}