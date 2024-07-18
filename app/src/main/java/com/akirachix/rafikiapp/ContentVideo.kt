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
import com.akirachix.rafikiapp.databinding.ActivityVideoBinding

class ContentVideo : AppCompatActivity() {
    lateinit var binding: ActivityVideoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivVideo4.setOnClickListener {
            val intent= Intent(this,ActivityVideoBinding::class.java)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.ivHome4).setOnClickListener {
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