package com.example.homework_17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_17.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val menuAdapter by lazy { MenuAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvMenu.adapter = menuAdapter
        menuAdapter.submitList(Items.menuList)
    }
}