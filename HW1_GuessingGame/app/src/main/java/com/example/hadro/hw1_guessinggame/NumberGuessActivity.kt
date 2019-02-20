package com.example.hadro.hw1_guessinggame

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.*

import kotlinx.android.synthetic.main.activity_number_guess.*

class NumberGuessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_guess)
        setSupportActionBar(toolbar)

        var rnum= randomnum()
        var count= 0

        val Num1 = findViewById(R.id.Num1) as EditText
        val check = findViewById(R.id.button1) as Button

        check.setOnClickListener{

            val enteredNum = Num1.text.toString()
            count++

            if (rnum > Integer.parseInt(enteredNum)) {
                Toast.makeText(applicationContext, "Fallo, El numero es menor", Toast.LENGTH_SHORT).show()
            } else if(rnum < Integer.parseInt(enteredNum)){
                Toast.makeText(applicationContext, "Fallo, El numero es Mayor", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Buen Trabajo", Toast.LENGTH_SHORT).show()
            }
        }

    }

    fun randomnum(): Int{
        return Random().nextInt(1000)
    }

}
