package com.example.mykotlin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity7 : AppCompatActivity() {
    var gameState = arrayOf(arrayOf(0,0,0),arrayOf(0,0,0),arrayOf(0,0,0))
    var playerActive:Int = 1
    var gameActive = true


//    var gameWins = arrayOf(arrayOf(0,1,2),arrayOf(3,4,5),arrayOf(6,7,8),arrayOf(0,3,6),
//        arrayOf(1,4,7),arrayOf(2,5,8),arrayOf(0,4,8),arrayOf(2,4,6))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)



    }

    fun coinAppear(view: View)
    {
        val res = findViewById<TextView>(R.id.txt_ma7)

        val img: ImageView = view as ImageView
        var tag:Int = img.getTag().toString().toInt()
        var row= tag/3
        var col = tag%3
        if(gameState[row][col] == 0 && gameActive == true)
        {
            if(playerActive==1)
            {
                img.setImageResource(R.drawable.white)
                playerActive = 2
                gameState[row][col] = 2
            }
            else{
                img.setImageResource(R.drawable.black)
                playerActive = 1
                gameState[row][col] = 1
            }
        }
        if(rowCheck(row,playerActive) || colCheck(col,playerActive) || diaCheck())
        {
            res.text = if(playerActive == 1) "Black Wins" else "White Wins"
            gameActive = false

        }
        else if(drawCheck())
        {
            res.text = "Draw Game"
            gameActive = false
        }
        Log.i("Activity","$gameActive $playerActive")



    }

    fun rowCheck(row:Int, player:Int): Boolean{
        for(pos in 0 until 3)
        {
            if(gameState[row][pos] != player)
            {
                return false
            }
        }
        return true

    }
    fun colCheck(col:Int, player:Int): Boolean{
        for(pos in 0 until 3)
        {
            if(gameState[pos][col] != player)
            {
                return false
            }
        }
        return true
    }
    fun diaCheck():Boolean
    {
        return (gameState[0][0]==gameState[1][1] && gameState[1][1] ==gameState[2][2] && gameState[2][2]!=0) ||
                (gameState[0][2]==gameState[1][1] && gameState[1][1] == gameState[2][0] && gameState[2][0]!=0 && gameState[0][2]!=0)

    }

    fun drawCheck():Boolean
    {
        for(row in 0 until 3)
        {
            for(col in 0 until 3)
            {
                if(gameState[row][col]==0)
                    return false
            }
        }
        return true
    }

}


/*

0 1 2
3 4 5
6 7 8

[0,3,6], [1,4,7], [2,5,8], [0,4,8], [2,4,6]


 */


