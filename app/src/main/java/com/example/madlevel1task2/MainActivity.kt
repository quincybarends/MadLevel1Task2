package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSubmit.setOnClickListener{
            onSubmit()
        }
    }

    private fun onSubmit(){
        var correctAnswers = 0
        val answerTT = binding.etTT.text.toString()
        val answerTF = binding.etTF.text.toString()
        val answerFT = binding.etFT.text.toString()
        val answerFF = binding.etFF.text.toString()

        if  (answerTT == "T"){
            correctAnswers += 1
        }
        if (answerTF == "F"){
            correctAnswers += 1
        }
        if (answerFT == "F"){
            correctAnswers += 1
        }
        if (answerFF == "F"){
            correctAnswers += 1
        }

        Toast.makeText(this, getString(R.string.correct_answers, correctAnswers), Toast.LENGTH_LONG).show()
    }
}