package com.besugos.desafio2dha.view

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
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.besugos.desafio2dha.R
import com.besugos.desafio2dha.model.PratoModel


class RestauranteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_restaurante, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)

        val nomeRestaurante = arguments?.getString("NOME")
        val fotoRestaurante = requireArguments().getInt("FOTO")

        view.findViewById<ImageView>(R.id.imgFotoRestaurante)
            .setImageResource(fotoRestaurante)
        view.findViewById<TextView>(R.id.txtNomeRestaurante).text = nomeRestaurante

        val viewManager = GridLayoutManager(context, 2)

        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_lista_pratos)

        val fotoPrato = requireArguments().getInt("FOTO_PRATO")
        val nomePrato = arguments?.getString("NOME_PRATO")
        val receitaPrato = arguments?.getString("RECEITA_PRATO")

        val pratos = arrayListOf<PratoModel>()

        for (i in 0..9) {
            pratos.add(
                PratoModel(fotoPrato, nomePrato!!, receitaPrato!!)
            )
        }

        val viewAdapter = PratoAdapter(pratos) {
            val bundle = bundleOf("NOME_RESTAURANTE" to nomeRestaurante,
                "FOTO_RESTAURANTE" to fotoRestaurante, "FOTO" to it.fotoURL, "NOME" to it.nome,
                "RECEITA" to it.receita)

            navController.navigate(R.id.pratoFragment, bundle)
        }

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }

        view.findViewById<ImageButton>(R.id.btnBackRestaurante).setOnClickListener {
            navController.navigate(R.id.homeFragment)
        }

    }
}

