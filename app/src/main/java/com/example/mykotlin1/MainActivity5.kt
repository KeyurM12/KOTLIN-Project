package com.example.mykotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val btn = findViewById<Button>(R.id.btn_ma5)
        val input_temp = findViewById<EditText>(R.id.temp1)
        val input_read = findViewById<EditText>(R.id.read1)
        val txt = findViewById<TextView>(R.id.res1_ma5)

        btn.setOnClickListener(View.OnClickListener {
            var day:String = randomDay()
            var temp:Int = input_temp.text.toString().toInt()
            var read:Int = input_read.text.toString().toInt()
            var res:String = ""
            res = "Day is: $day\nTemperature is: ${temp}'C\nReading Sensor says: $read\n1) Food to be eaten is ${
                food(
                    day
                )
            }\n2) Water should${if (water(day, temp, read)) "" else " not"} be changed\n"

            txt.text = "$res"
        })


    }
    fun randomDay():String
    {
        var days = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
        var day=days[Random().nextInt(days.size)]
        return day
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
}