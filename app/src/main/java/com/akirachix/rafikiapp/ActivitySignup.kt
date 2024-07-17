package com.akirachix.rafikiapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.rafikiapp.databinding.ActivityActivitysignupBinding

class ActivitySignup : AppCompatActivity() {
    lateinit var binding: ActivityActivitysignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActivitysignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signInTxt.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.btnSignUp.setOnClickListener {
            clearError()
            var formError = false
            val firstName = binding.tilFirstName.text.toString()
            if (firstName.isBlank()) {
                formError = true
                binding.etFirstName.error = getString(R.string.firstname_is_required)
            }


            val lastName = binding.tilLastName.text.toString()
            if (lastName.isBlank()) {
                formError = true
                binding.etLastName.error = getString(R.string.lastname_is_required)
            }


            val email = binding.tilEmail.text.toString()
            if (email.isBlank()) {
                formError = true
                binding.etEmail.error = getString(R.string.email_required)
            }

            val password = binding.tilPassword.text.toString()
            if (password.isBlank()) {
                formError = true
                binding.etPassword.error = getString(R.string.password_required)
            }
            val confirmPassword = binding.tilPassword.text.toString()
            if (confirmPassword.isBlank()) {
                formError = true
                binding.etConfirmPas.error = getString(R.string.password_confirmation_is_required)
            }
            if (password != confirmPassword) {
                formError = true
                binding.etConfirmPas.error =
                    getString(R.string.password_and_confirmation_do_not_match)
            } else {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
        fun validateRegistration() {

        }

        fun clearError() {
            binding.etFirstName.error = null
            binding.etLastName.error = null
            binding.etEmail.error = null
            binding.etPassword.error = null
            binding.etConfirmPas.error = null
        }
    }


