package com.example.calculadoracorporal

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonMasc.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MasculinoActivity::class.java)
            intent.putExtra("idade", editIdade.text.toString())
            intent.putExtra("peso", editPeso.text.toString().toDouble())
            startActivity(intent)

        })
        buttonFemin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, FemininoActivity::class.java)
            intent.putExtra("idade", editIdade.text.toString())
            intent.putExtra("peso",editPeso.text.toString().toDouble())
            startActivity(intent)

        })
    }

}


