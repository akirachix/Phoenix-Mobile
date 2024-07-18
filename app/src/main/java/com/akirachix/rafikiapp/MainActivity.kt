package com.akirachix.rafikiapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.rafikiapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val intent = Intent(this, conte::class.java)
//        startActivity(intent)
        findViewById<Button>(R.id.btnVideos).setOnClickListener {
            startActivity(Intent(this, ContentVideo::class.java))
        }

        findViewById<Button>(R.id.btnNotes).setOnClickListener {
            startActivity(Intent(this, content_notes::class.java))
        }

        findViewById<Button>(R.id.btnLeaderboard).setOnClickListener {
            startActivity(Intent(this, LeaderboardItemActivity::class.java))
        }
    }
}