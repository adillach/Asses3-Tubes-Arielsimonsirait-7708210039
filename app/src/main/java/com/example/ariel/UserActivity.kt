package com.example.ariel

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.ariel.databinding.ActivityMainBinding
import com.example.ariel.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity () {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val country = intent.getStringExtra("country")
        val imageId = intent.getIntExtra("imageId",R.drawable.a)

        binding.CdName.text = name
        binding.phoneNum.text = phone
        binding.cdCountry.text = country
        binding.Cdprofpic.setImageResource(imageId)

    }
}