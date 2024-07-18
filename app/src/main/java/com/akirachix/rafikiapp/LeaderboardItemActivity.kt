package com.akirachix.rafikiapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.rafikiapp.databinding.ActivityVideoBinding

class LeaderboardItemActivity : AppCompatActivity() {
    lateinit var binding: LeaderboardItemActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = LeaderboardItemActivity.in
        setContentView(R.layout.leaderboard_item)

    }
}