package com.example.callbacksapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    val tag = "Activity 2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        showToast(this, "onCreate Activity 2")
        Log.d(tag, "OnCreate: ")
    }


    override fun onStart() {
        super.onStart()
        showToast(this, "onStart Activity 2")
        Log.d(tag, "OnStart: ")
    }


    override fun onResume() {
        super.onResume()
        showToast(this, "onResume Activity 2")
        Log.d(tag, "onResume: ")

    }

    override fun onPause() {
        super.onPause()
        showToast(this, "onPause Activity 2")
        Log.d(tag, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        showToast(this, "onStop Activity 2")
        Log.d(tag, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast(this, "onDestroy Activity 2")
        Log.d(tag, "onDestroy: ")
    }


    private fun showToast(context : Context, msg : String){
        Toast.makeText(context , msg, Toast.LENGTH_SHORT).show()
    }
}