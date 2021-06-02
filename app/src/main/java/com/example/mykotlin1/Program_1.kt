package com.example.mykotlin1
import java.util.*

fun main()
{

    var day = randomDay()
    val temp:Int = randomNum()
    val read:Int = randomNum()
    println("Day is: $day\nTemperature is: ${temp}'C and Reading sensor says: $read\n")
    println("Food to be eaten is ${food(day)}")
    println("Water should${if(water(day,temp,read)) "" else " not"} be changed")
}

fun randomDay():String
{
    var days = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    var num:Int = Random().nextInt(days.size)
    var day=days[num]
    return day
}

fun randomNum():Int
{
    var num:Int = Random().nextInt(100)
    return num
}

fun food(day:String):String
{
    when(day)
    {
        "Monday" -> return "Flakes"
        "Tuesday" -> return "Pellets"
        "Wednesday" -> return "Redworms"
        "Thursday" -> return "Granules"
        "Friday" -> return "Mosquitoes"
        "Saturday" -> return "Lettuce"
        "Sunday" -> return "Plankton"
    }
    return ""
}

fun water(day:String, temp:Int ,read: Int):Boolean
{
    if(day=="Sunday" || temp>30 || read>30)
    {
        return true
    }
    return false
}