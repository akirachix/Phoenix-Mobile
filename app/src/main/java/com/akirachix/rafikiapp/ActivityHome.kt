package com.akirachix.rafikiapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.rafikiapp.databinding.ActivityHomeBinding
import com.akirachix.rafikiapp.databinding.ActivityMainBinding
import com.akirachix.rafikiapp.databinding.ActivitySelectionBinding


class ActivityHome : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)

        setContentView(binding.root)



        binding.btnQuiz.setOnClickListener {
            val intent = Intent(this, ActivitySelection::class.java)
            startActivity(intent)
        }
        binding.btnVideo.setOnClickListener {
            val intent = Intent(this, ActivitySelection::class.java)
            startActivity(intent)
        }
        binding.btnNotes.setOnClickListener {
            val intent = Intent(this, ActivitySelection::class.java)
            startActivity(intent)
        }


        }
}