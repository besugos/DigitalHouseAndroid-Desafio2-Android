package com.besugos.desafio2dha

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation


class PratoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_prato, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)

        view.findViewById<ImageView>(R.id.imgFotoPrato).setImageResource(requireArguments().getInt("FOTO"))
        view.findViewById<TextView>(R.id.txtNomePrato).text = arguments?.getString("NOME")
        view.findViewById<TextView>(R.id.txtReceitaPrato).text = arguments?.getString("RECEITA")


        view.findViewById<ImageButton>(R.id.btnBackPrato).setOnClickListener {
            navController.navigate(R.id.detalheFragment)
        }
    }

}