package com.akirachix.rafikiapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AskRafikiActivity : AppCompatActivity() {
    lateinit var binding: AskRafikiActivity


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AskRafikiActivity.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSubmit.setOnClickListener {
            validate("Ask Rafiki")
            val intent = Intent(this, ResponseActivity::class.java)
            startActivity(intent)
        }
    }

    fun validate (operation: String) {
        val answer = binding.etAnswer.text.toString()
        var oneError = false
        if (answer.isBlank()) {
            oneError = true
            binding.etAnswer.error = getString(R.string.answer)
        }

    }
}
