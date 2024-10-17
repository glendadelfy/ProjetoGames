package com.glenda.projetogames

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class CadastroFragment : Fragment() {
    private lateinit var btnEnviar:Button
    private lateinit var txtResultado:TextView

    private var nomeUser:String? =null
    private var idade:Int? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nomeUser = arguments?.getString("nomeUser")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_cadastro, container, false)

        btnEnviar = view.findViewById(R.id.btnEnviar)
        txtResultado = view.findViewById(R.id.txtResultado)

        txtResultado.text = nomeUser

        btnEnviar.setOnClickListener{
            nomeUser = arguments?.getString("nomeUser")
            idade = arguments?.getInt("idade")


            Log.i("teste", "nome:$nomeUser - Idade:$idade")
        }
        return view
    }





}