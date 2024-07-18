package com.akirachix.rafikiapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.rafikiapp.databinding.ActivityAskRafikiBinding

class AskRafikiActivity : AppCompatActivity() {

    lateinit var binding: ActivityAskRafikiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAskRafikiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            val intent = Intent(this, AskRafikiActivity::class.java)
            startActivity(intent)
        }
        binding.btnSubmit.setOnClickListener {
           validate()
        }
    }


    fun validate() {
        clearErrors()
        var oneError = false
        val answer = binding.etAnswer.text.toString()
        if (answer.isBlank()) {
            oneError = true
            binding.etAnswer.error = getString(R.string.answer_is_required)

        }
        if (oneError != true) {
            //Proceed to registration
        }
    }

    fun clearErrors() {
        binding.textInputLayout.error = null
    }
}


