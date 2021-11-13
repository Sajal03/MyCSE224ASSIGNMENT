package com.example.myandroidapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.widget.CheckBox
import android.widget.Toast

class Question2App : AppCompatActivity() {
    lateinit var RadioBtn: RadioButton
    lateinit var RadioBtn2: RadioButton
    lateinit var RadioBtn3: RadioButton

    lateinit var termsConditions: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2_app)

        val name = findViewById<EditText>(R.id.editTextTextPersonName2)
        val password = findViewById<EditText>(R.id.editTextNumberPassword)
       // val Rgrp = findViewById<RadioGroup>(R.id.RGrp)
        val Submit = findViewById<Button>(R.id.btnsubmit)

        RadioBtn = findViewById(R.id.Radiobtn)
        RadioBtn.setOnClickListener{

            if (RadioBtn.isChecked){
                Toast.makeText(applicationContext, "You have selected Male", Toast.LENGTH_LONG).show()
            }
        }

        RadioBtn2 = findViewById(R.id.Radiobtn2)
        RadioBtn2.setOnClickListener{

            if (RadioBtn2.isChecked){
                Toast.makeText(applicationContext, "You have selected Female", Toast.LENGTH_LONG).show()
            }
        }

        RadioBtn3 = findViewById(R.id.Radiobtn3)
        RadioBtn3.setOnClickListener{

            if (RadioBtn3.isChecked){
                Toast.makeText(applicationContext, "You have Decided not to say your Gender", Toast.LENGTH_LONG).show()
            }
        }


        termsConditions = findViewById(R.id.checkBox)
        termsConditions.setOnClickListener{
          //  val result = StringBuilder()

            if (termsConditions.isChecked){
            Toast.makeText(applicationContext, "You have agreed to the Terms and Conditions", Toast.LENGTH_LONG).show()
            }
        }

    }
}