package com.mobdev.latihan_lint

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

//@SuppressLint("all")
class MainActivity : AppCompatActivity() {

    private lateinit var text: String

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text: TextView = findViewById(R.id.text_opening)
        text.text = "Lint lint lint"
    }
}