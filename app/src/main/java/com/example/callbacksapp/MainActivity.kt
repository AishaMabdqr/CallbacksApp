package com.example.callbacksapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

        var tag = "Activity 1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast(this, "onCreate Activity 1")
        Log.d(tag, "OnCreate: ")

        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener (object : View.OnClickListener {
            override fun onClick(p0: View?) {

                val intent = Intent(this@MainActivity, SecondActivity ::class.java)
                startActivity(intent)
            }
        })
    }

    override fun onStart() {
        super.onStart()
        showToast(this, "onStart Activity 1")
        Log.d(tag, "OnStart: ")
    }


    override fun onResume() {
        super.onResume()
        showToast(this, "onResume Activity 1")
        Log.d(tag, "onResume: ")

    }

    override fun onPause() {
        super.onPause()
        showToast(this, "onPause Activity 1")
        Log.d(tag, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        showToast(this, "onStop Activity 1")
        Log.d(tag, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast(this, "onDestroy Activity 1")
        Log.d(tag, "onDestroy: ")
    }


    private fun showToast(context : Context, msg : String){
        Toast.makeText(context , msg, Toast.LENGTH_SHORT).show()
    }
}