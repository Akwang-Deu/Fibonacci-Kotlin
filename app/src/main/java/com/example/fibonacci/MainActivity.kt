package com.example.fibonacci

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fibonacci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fibosequence = fiboNums(100)
        binding.trNames.layoutManager = GridLayoutManager(this,2)
        val numAdapter = FibonacciRecycled(fibosequence)
        binding.trNames.adapter = numAdapter

    }
    fun fiboNums(number:Int): List <Int> {
        val nums = mutableListOf(0,1)
        while (nums.size < 100){
            nums.add(nums[nums.lastIndex] + nums[nums.lastIndex-1])
        }
        return nums
    }
}
