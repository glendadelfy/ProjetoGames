package com.glenda.projetogames

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ListView

class LoginFragment : Fragment() {

    private lateinit var btnEntrar2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        btnEntrar2 = view.findViewById(R.id.btnEntrar2)

        btnEntrar2.setOnClickListener{
            val navegarTela = Intent(activity, TelaInicial::class.java)
            startActivity(navegarTela)
        }
        return view
    }
}