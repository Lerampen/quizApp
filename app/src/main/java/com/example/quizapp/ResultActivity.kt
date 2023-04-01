package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName : TextView = findViewById(R.id.tvName)
        val tvScore: TextView = findViewById(R.id.tvScore)
        val btnFinish : Button = findViewById(R.id.btnFinish)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)

        //Total queations
        val totalQns = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWER,0)

        tvScore.text = "Your score is $correctAnswers out of $totalQns"
        btnFinish.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }



    }
}