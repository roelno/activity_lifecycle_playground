package com.zelda.activitylifecycleplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.zelda.activitylifecycleplayground.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.Date

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonExit.setOnClickListener {
            Log.d("Zelda", "In the button click listener...")
            finish()
        }

        val currentTime = SimpleDateFormat("HH:mm:ss").format(Date())
        binding.textViewRefreshStatus.text = "Current time: $currentTime"
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
        val currentTime = SimpleDateFormat("HH:mm:ss").format(Date())
        binding.textViewRefreshStatus.text = "Welcome Back!\nCurrent time: $currentTime"
    }
}