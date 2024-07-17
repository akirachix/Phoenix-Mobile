package com.akirachix.rafikiapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.rafikiapp.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {

    lateinit var binding: ActivityQuizBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.submit.setOnClickListener {
            validateRegistration()
        }

    }


    fun validateRegistration() {
        clearErrors()
        var formError = false
        val firstName = binding.etQuiz1.text.toString()
        if (firstName.isBlank()) {
            formError = true
            binding.tilQuiz1.error = getString(R.string.first_name_is_required)
        }
        val lastName = binding.etQuiz2.text.toString()
        if (lastName.isBlank()) {
            formError = true
            binding.tilQuiz2.error = getString(R.string.last_name_is_required)
        }

        val codeHiveId = binding.etQuiz3.text.toString()
        if (codeHiveId.isBlank()) {
            formError = true
            binding.tilQuiz3.error = getString(R.string.codehive_id_is_required)
        }


        if (formError != true) {
            //Proceed to registration
        }

    }

    fun clearErrors() {
        binding.tilQuiz1.error = null
        binding.tilQuiz2.error = null
        binding.tilQuiz3.error = null

    }

