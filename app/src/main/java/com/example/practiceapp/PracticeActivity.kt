package com.example.practiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.practiceapp.databinding.ActivityPracticeBinding

class PracticeActivity : AppCompatActivity() {
    lateinit var binding: ActivityPracticeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPracticeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener { startActivity(Intent(this,MainActivity::class.java)) }

//        var back = findViewById<Button>(R.id.button)
//        back.setOnClickListener { startActivity(Intent(this,MainActivity::class.java)) }
    }
}