package com.example.mykotlin1

import java.util.*

class Person {
    var name:String? = null
    get() = field
    set(value){
        field = value?.uppercase(Locale.getDefault())
    }
    var gender:String? = null
    var age:Int = 0
    get() = field

    set(value) = if(value<18) field = 0 else field = value

    fun display():String? = name



}