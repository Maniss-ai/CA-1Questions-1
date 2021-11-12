package com.example.ca_1questions_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import com.example.ca_1questions_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var radioButtonMale: RadioButton
    private lateinit var radioButtonFemale: RadioButton
    private lateinit var button: Button
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.radioMale.setOnClickListener {
            Toast.makeText(this, "You Selected Your Gender as MALE", Toast.LENGTH_SHORT).show()
        }
        binding.radioFemale.setOnClickListener {
            Toast.makeText(this, "You Selected Your Gender as FEMALE", Toast.LENGTH_SHORT).show()
        }
        binding.button.setOnClickListener {
            Toast.makeText(this, binding.editText.text.toString(), Toast.LENGTH_SHORT).show()
        }
        setContentView(binding.root)
    }
}