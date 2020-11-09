package com.besugos.desafio2dha

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RestauranteAdapter(private val dataSet: List<Restaurante>) :
    RecyclerView.Adapter<RestauranteAdapter.MeuViewHolder>() {

    class MeuViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imgRestaurante: ImageView = view.findViewById(R.id.ivPic)
        private val txtNome: TextView = view.findViewById(R.id.tvNomeRestaurante)
        private val txtLocal: TextView = view.findViewById(R.id.tvLocal)
        private val txtHora: TextView = view.findViewById(R.id.tvHora)

        fun bind(restaurante: Restaurante) {
            imgRestaurante.setImageResource(restaurante.fotoURL)
            txtNome.text = restaurante.nome
            txtLocal.text = restaurante.local
            txtHora.text = restaurante.hora
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeuViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_lista_restaurante, parent, false)

        return MeuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MeuViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }

    override fun getItemCount() = dataSet.size
}


