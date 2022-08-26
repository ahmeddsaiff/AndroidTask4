package com.example.BasketBallScore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.coroutines.delay as delay1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = click()
    }

    fun click(){
        var ResTeam1=0
        var ResTeam2=0
        val Team1Score = findViewById<TextView>(R.id.team1_score)
        val Team2Score = findViewById<TextView>(R.id.team2_score)
        val Add2_1 = findViewById<Button>(R.id.team1_add2)
        val Add2_2 = findViewById<Button>(R.id.team2_add2)
        val Add3_1 = findViewById<Button>(R.id.team1_add3)
        val Add3_2 = findViewById<Button>(R.id.team2_add3)
        Add2_1.setOnClickListener {
            ResTeam1+=2
            Toast.makeText(this , "team1 +2" , Toast.LENGTH_SHORT).show()
            Team1Score.text=ResTeam1.toString()
        }
        Add3_1.setOnClickListener {
            ResTeam1+=3
            Toast.makeText(this , "team1 +3" , Toast.LENGTH_SHORT).show()
            Team1Score.text=ResTeam1.toString()
        }
        Add2_2.setOnClickListener {
            ResTeam2+=2
            Toast.makeText(this , "team2 +2" , Toast.LENGTH_SHORT).show()
            Team2Score.text=ResTeam2.toString()
        }
        Add3_2.setOnClickListener {
            ResTeam2+=3
            Toast.makeText(this , "team2 +3" , Toast.LENGTH_SHORT).show()
            Team2Score.text=ResTeam2.toString()
        }
    }
}