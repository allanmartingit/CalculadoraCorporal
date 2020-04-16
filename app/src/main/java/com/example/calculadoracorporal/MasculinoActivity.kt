package com.example.calculadoracorporal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.math.log10
import android.view.View
import kotlinx.android.synthetic.main.activity_masculino.*

class MasculinoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masculino)
        buttonCalcDC.setOnClickListener(View.OnClickListener {
            resultadoDC()
        })
    }

    fun resultadoDC(){
        val soma = editSB.text.toString().toDouble()+editSIMas.text.toString().toDouble()+editTR.text.toString().toDouble()
        val resultado: Double = 1.17136-0.06706 * log10(soma)
        val peso = intent.getDoubleExtra("peso",0.0)
        val intent = Intent(this,ResultadoMascActivity::class.java )
        intent.putExtra("DC", resultado)
        intent.putExtra("peso", peso)

        startActivity(intent)

    }

}
