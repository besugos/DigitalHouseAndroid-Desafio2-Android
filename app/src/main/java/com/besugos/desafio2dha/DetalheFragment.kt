package com.besugos.desafio2dha

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class DetalheFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detalhe, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)

        val viewManager = GridLayoutManager(context, 2)

        //val viewManager = LinearLayoutManager(context)

        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_lista_pratos)

        val prato1 = Prato(
            R.drawable.aoyama, "Salada com molho Gengibre"
        )
        val prato2 = Prato(
            R.drawable.aoyama, "Salada com molho Gengibre"
        )
        val prato3 = Prato(
            R.drawable.aoyama, "Salada com molho Gengibre"
        )
        val prato4 = Prato(
            R.drawable.aoyama, "Salada com molho Gengibre"
        )
        val prato5 = Prato(
            R.drawable.aoyama, "Salada com molho Gengibre"
        )
        val prato6 = Prato(
            R.drawable.aoyama, "Salada com molho Gengibre"
        )
        val prato7 = Prato(
            R.drawable.aoyama, "Salada com molho Gengibre"
        )
        val prato8 = Prato(
            R.drawable.aoyama, "Salada com molho Gengibre"
        )
        val prato9 = Prato(
            R.drawable.aoyama, "Salada com molho Gengibre"
        )
        val prato10 = Prato(
            R.drawable.aoyama, "Salada com molho Gengibre"
        )


        val viewAdapter = PratoAdapter(arrayListOf(prato1, prato2, prato3, prato4, prato5, prato6, prato7, prato8, prato9, prato10)) {
//            val navController = Navigation.findNavController(view)
            navController.navigate(R.id.homeFragment)
        }

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }

        view.findViewById<ImageButton>(R.id.btnBackDetalhe).setOnClickListener {
            navController.navigate(R.id.homeFragment)
        }

    }
}

