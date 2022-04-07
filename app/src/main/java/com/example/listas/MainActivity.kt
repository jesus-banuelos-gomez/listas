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

        listaPersonaje.add(Personaje("Bender", "https://img2.freepng.es/20171220/ake/futurama-bender-png-5a3a03f952e1b6.81399659151375154533958088.jpg"))
        listaPersonaje.add(Personaje("Homero", "https://img2.freepng.es/20181204/vo/kisspng-higher-maths-clip-art-mathematics-yahoo-answers-5c064d3aa59ad1.3031538515439168586783.jpg"))
        listaPersonaje.add(Personaje("Bender", "https://img2.freepng.es/20171220/ake/futurama-bender-png-5a3a03f952e1b6.81399659151375154533958088.jpg"))
        listaPersonaje.add(Personaje("Homero", "https://img2.freepng.es/20181204/vo/kisspng-higher-maths-clip-art-mathematics-yahoo-answers-5c064d3aa59ad1.3031538515439168586783.jpg"))
        listaPersonaje.add(Personaje("Bender", "https://img2.freepng.es/20171220/ake/futurama-bender-png-5a3a03f952e1b6.81399659151375154533958088.jpg"))
        listaPersonaje.add(Personaje("Homero", "https://img2.freepng.es/20181204/vo/kisspng-higher-maths-clip-art-mathematics-yahoo-answers-5c064d3aa59ad1.3031538515439168586783.jpg"))
        listaPersonaje.add(Personaje("Bender", "https://img2.freepng.es/20171220/ake/futurama-bender-png-5a3a03f952e1b6.81399659151375154533958088.jpg"))
        listaPersonaje.add(Personaje("Homero", "https://img2.freepng.es/20181204/vo/kisspng-higher-maths-clip-art-mathematics-yahoo-answers-5c064d3aa59ad1.3031538515439168586783.jpg"))


        miRecycler =findViewById(R.id.RecyclerPersonajes)

        miRecycler.adapter = PersonajeAdapter(listaPersonaje)
        miRecycler.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }
}