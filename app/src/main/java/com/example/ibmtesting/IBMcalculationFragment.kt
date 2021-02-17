package com.example.ibmtesting

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class IBMcalculationFragment : AppCompatActivity() {

    var bmiIndex:Double = 0.00

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_i_b_mcalculation_fragment)


        val personName = intent?.getStringExtra("personName")
        val tv = findViewById<TextView>(R.id.userName)
        tv.setText(personName)

        if(savedInstanceState != null)
        {
            bmiIndex = savedInstanceState.getDouble("bmiIndex")
            val status = findViewById<TextView>(R.id.statusOutputID)
            status.setText(calculateIBM())
        }


        val btn = findViewById<Button>(R.id.calculateButton)

        btn.setOnClickListener{

            val weight = findViewById<TextView>(R.id.weightInputID).text.toString()
            val height = findViewById<TextView>(R.id.HeightInputID).text.toString()
            val status = findViewById<TextView>(R.id.statusOutputID)
            bmiIndex = weight.toDouble()/(height.toDouble()*height.toDouble())

            status.setText(calculateIBM())
        }

    }

    fun calculateIBM():String{

        if (bmiIndex<18.5)
            return "underweight"
        else if (bmiIndex<=24.9)
            return "Noemal weight"
        else if (bmiIndex<=29.9)
            return "OverWeight"
        else if (bmiIndex<=34.9)
            return "Obesity class I"
        else if (bmiIndex<=39.9)
            return "Obesity Class II"
        else
            return "Obesity Class III"

    }
}
