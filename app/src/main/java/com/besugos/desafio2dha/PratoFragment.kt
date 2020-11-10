package com.besugos.desafio2dha

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.Navigation


class PratoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_prato, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)

        val nomeRestaurante = arguments?.getString("NOME_RESTAURANTE")
        val fotoRestaurante = requireArguments().getInt("FOTO_RESTAURANTE")
        val fotoPrato = requireArguments().getInt("FOTO")
        val nomePrato = arguments?.getString("NOME")
        val receitaPrato = arguments?.getString("RECEITA")

        view.findViewById<ImageView>(R.id.imgFotoPrato).setImageResource(fotoPrato)
        view.findViewById<TextView>(R.id.txtNomePrato).text = nomePrato
        view.findViewById<TextView>(R.id.txtReceitaPrato).text = receitaPrato

        view.findViewById<ImageButton>(R.id.btnBackPrato).setOnClickListener {
            val bundle = bundleOf(
                "NOME" to nomeRestaurante, "FOTO" to fotoRestaurante,
                "FOTO_PRATO" to fotoPrato, "NOME_PRATO" to nomePrato,
                "RECEITA_PRATO" to receitaPrato
            )
            navController.navigate(R.id.restauranteFragment, bundle)
        }
    }
}