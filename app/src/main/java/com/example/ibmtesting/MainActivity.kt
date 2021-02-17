package com.example.ibmtesting

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_naming_fragment)

        val enterBtn = findViewById<Button>(R.id.enterButton)

        enterBtn.setOnClickListener {

            val intent = Intent(this,IBMcalculationFragment::class.java)
            val personName = findViewById<TextView>(R.id.nameInputID).text

            intent.putExtra("personName",personName.toString())

            startActivity(intent)

        }
    }
}
