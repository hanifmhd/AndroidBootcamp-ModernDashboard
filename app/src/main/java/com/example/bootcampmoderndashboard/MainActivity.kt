package com.example.bootcampmoderndashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bootcampmoderndashboard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cvWork.setOnClickListener{
            Toast.makeText(applicationContext,"Work",Toast.LENGTH_SHORT).show()
        }

        binding.cvEducation.setOnClickListener{
            Toast.makeText(applicationContext,"Education",Toast.LENGTH_SHORT).show()
        }

        binding.cvFitness.setOnClickListener{
            Toast.makeText(applicationContext,"Fitness",Toast.LENGTH_SHORT).show()
        }

        binding.cvGaming.setOnClickListener{
            Toast.makeText(applicationContext,"Gaming",Toast.LENGTH_SHORT).show()
        }

        binding.cvMedical.setOnClickListener{
            Toast.makeText(applicationContext,"Medical",Toast.LENGTH_SHORT).show()
        }

        binding.cvSetting.setOnClickListener{
            Toast.makeText(applicationContext,"Settings",Toast.LENGTH_SHORT).show()
        }

        binding.cvStartUp.setOnClickListener{
            Toast.makeText(applicationContext,"Start Up",Toast.LENGTH_SHORT).show()
        }

        binding.cvTravel.setOnClickListener{
            Toast.makeText(applicationContext,"Travel",Toast.LENGTH_SHORT).show()
        }
    }
}