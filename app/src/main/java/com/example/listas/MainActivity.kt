package com.example.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listas.adaptador.PersonajeAdapter
import com.example.listas.modelo.Personaje

class MainActivity : AppCompatActivity() {
    lateinit var miRecycler:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listaPersonaje = ArrayList<Personaje>()

        listaPersonaje.add(Personaje("Bender", ""))
        listaPersonaje.add(Personaje("Homero", ""))
        listaPersonaje.add(Personaje("bob", ""))
        listaPersonaje.add(Personaje("spiderman", ""))
        listaPersonaje.add(Personaje("miky", ""))
        listaPersonaje.add(Personaje("piolin", ""))
        listaPersonaje.add(Personaje("perro", ""))
        listaPersonaje.add(Personaje("gato", ""))

        miRecycler =findViewById(R.id.RecyclerPersonajes)

        miRecycler.adapter = PersonajeAdapter(listaPersonaje)
        miRecycler.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }
}