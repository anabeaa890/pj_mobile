package com.example.conexamplepjmobile

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var count = 0
    private lateinit var countTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countTextView = findViewById(R.id.valueTextView)
        val decrementButton: Button = findViewById(R.id.decrementButton)
        val incrementButton: Button = findViewById(R.id.incrementButton)

        incrementButton.setOnClickListener {
            count++
            updateCount() //
        }

        decrementButton.setOnClickListener {
            if (count > 0) {
                count--
                updateCount()
            }
        }
    }

    private fun updateCount() {
        countTextView.text = count.toString()
    }
}