package com.example.ciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.math.roundToLong

class MainActivity : AppCompatActivity() {
    var tStart : Long = 0
    var tTotal : Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onCreate")
        tStart = System.nanoTime()

        val miBoton: Button = findViewById(R.id.my_button)
        //miBoton.text = "Siiiii"

        val mensaje: TextView = findViewById(R.id.text_saludo)
        mensaje.text = "Adios Mundo!"
    }

    override fun onStart() {
        super.onStart()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onStart")
    }

    override fun onResume() {
        super.onResume()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onResume")
        val mensaje: TextView = findViewById(R.id.text_saludo)
        //mensaje.text = "La aplicación se ejecutó por $tTotal segundos"
        mensaje.text = getString(R.string.seg_activos) + tTotal
    }

    override fun onPause() {
        super.onPause()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado", "onPause")
        val tStop : Long = System.nanoTime()
        tTotal = tStop - tStart / 1000.0
        Log.d("Estado", "Tiempo en la aplicacion: $tTotal")
    }

    override fun onStop() {
        super.onStop()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado", "onRestart")
    }
    override fun onDestroy() {
        super.onDestroy()
        //Imprimimos en la ventana del "logcat"
        Log.d("Estado", "onDestroy")
    }
}