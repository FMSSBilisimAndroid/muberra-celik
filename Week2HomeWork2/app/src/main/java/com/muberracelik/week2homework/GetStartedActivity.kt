package com.muberracelik.week2homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muberracelik.week2homework.databinding.ActivityGetStartedBinding

class GetStartedActivity : AppCompatActivity() {

    private lateinit var binding : ActivityGetStartedBinding
    private lateinit var myIntent : Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGetStartedBinding.inflate(layoutInflater)
        setContentView(binding.root)
        myIntent = Intent(this,LoginActivity::class.java)

        binding.startedButton.setOnClickListener(){
            startActivity(myIntent)
        }
    }
}