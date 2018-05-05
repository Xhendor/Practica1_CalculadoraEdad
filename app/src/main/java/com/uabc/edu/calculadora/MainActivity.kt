package com.uabc.edu.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    calcular.setOnClickListener(View.OnClickListener { view ->

        //CONTENIDO DE LA ACCION DEL BOTON
        var texto= anio.text
        //Convertir Texto a Entero
        if(texto.length>0) {
            var anioParaCalcular = Integer.parseInt(texto.toString())

            //Realizar operacion de Año vs Fecha de nacimiento
            //Para version avanzada var fechaActual:Date =Date()

            val anioActual = 2018;

            resultado.text = (anioActual - anioParaCalcular).toString()
        }else{

           Toast.makeText(applicationContext,
                   "No lo haga, ingrese texto",
                   Toast.LENGTH_SHORT).show()
        }

    })


    }


}
