package com.glenda.projetogames

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaInicial : AppCompatActivity() {

    private lateinit var listViewGames:ListView
    private lateinit var btnEnvio:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_inicial)
        //chamada de vizualização do spinner
        spinnerExibicao()

        var listaDeJogos = listOf("The Sims", "Roblox", "Need for Speed", "Mortal Kombat", "Fifa")

        listViewGames = findViewById(R.id.listView)

        listViewGames.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            listaDeJogos
        )
        btnEnvio = findViewById(R.id.btnEnvio)
        btnEnvio.setOnClickListener{
             spinnerSelecionado()
        }

    }
    private fun spinnerExibicao(){
        var Jogos = listOf("The Sims", "Roblox", "Need for Speed", "Mortal Kombat", "Fifa")
        var spinnerGames:Spinner = findViewById(R.id.spinnerGames)

        spinnerGames.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            Jogos
        )
    }
    private fun spinnerSelecionado(){
        var spinnerGames:Spinner = findViewById(R.id.spinnerGames)
        var itemSelecionado = spinnerGames.selectedItem
        var itemPosicao = spinnerGames.selectedItemPosition

        var txtResultado2:TextView = findViewById(R.id.txtResultado2)
        txtResultado2.text = "ITEM SELECIONADO ${itemSelecionado} - POSICAO ${itemPosicao}"

    }
}