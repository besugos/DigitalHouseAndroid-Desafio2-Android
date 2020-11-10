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
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class RestauranteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_restaurante, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)

        view.findViewById<ImageView>(R.id.imgFotoRestaurante).setImageResource(requireArguments().getInt("FOTO"))
        view.findViewById<TextView>(R.id.txtNomeRestaurante).text = arguments?.getString("NOME")

        val viewManager = GridLayoutManager(context, 2)

        //val viewManager = LinearLayoutManager(context)

        val recyclerView = view.findViewById<RecyclerView>(R.id.rv_lista_pratos)

        val pratos = arrayListOf<Prato>()

        for (i in 0..9) {
            pratos.add(Prato(R.drawable.aoyama, "Salada com molho Gengibre", "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."))
        }

        val viewAdapter = PratoAdapter(pratos) {
            val bundle = bundleOf("FOTO" to it.fotoURL, "NOME" to it.nome, "RECEITA" to it.receita)
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

