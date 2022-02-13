package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding //enclose in acitivity main baru can work


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main) //point to the whole view

        val s: Student = Student("W123","John")

        //binding.tvID.text ="W123456"
        binding.myData=s

        binding.btnUpdate.setOnClickListener() {
            s.studentName ="Alex"

            //to refresh and display the new value
            binding.apply {
                invalidateAll()
            }
        }


    }
}