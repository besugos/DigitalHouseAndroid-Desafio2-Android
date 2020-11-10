package com.besugos.desafio2dha

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewManager = LinearLayoutManager(context)

        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_lista)

        val repository = Repository()

        val rest1 = repository.rest1
        val rest2 = repository.rest2
        val rest3 = repository.rest3
        val rest4 = repository.rest4

        val viewAdapter = RestauranteAdapter(arrayListOf(rest1, rest2, rest3, rest4)) {
            val navController = Navigation.findNavController(view)
            val bundle = bundleOf(
                "NOME" to it.nome, "FOTO" to it.fotoURL,
                "FOTO_PRATO" to it.prato.fotoURL, "NOME_PRATO" to it.prato.nome,
                "RECEITA_PRATO" to it.prato.receita
            )
            navController.navigate(R.id.restauranteFragment, bundle)
        }
        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }
}