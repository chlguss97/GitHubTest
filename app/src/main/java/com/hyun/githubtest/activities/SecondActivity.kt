package com.hyun.githubtest.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hyun.githubtest.R
import com.hyun.githubtest.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}