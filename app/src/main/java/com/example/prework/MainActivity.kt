package com.example.prework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //button
      val button = findViewById<Button>(R.id.button)
      button.setOnClickListener {
      //toast
        Toast.makeText(it.context, "We're pretty awesome!", Toast.LENGTH_LONG).show()
      }


    }
}
