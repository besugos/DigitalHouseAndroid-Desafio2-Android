package com.besugos.desafio2dha

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RestauranteAdapter(private val dataSetRestaurantes: List<RestauranteModel>, private val listener: (RestauranteModel) -> Unit) :
    RecyclerView.Adapter<RestauranteAdapter.ViewHolderRestaurantes>() {

    class ViewHolderRestaurantes(view: View) : RecyclerView.ViewHolder(view) {
        private val imgRestaurante: ImageView = view.findViewById(R.id.ivPic)
        private val txtNome: TextView = view.findViewById(R.id.tvNomeRestaurante)
        private val txtLocal: TextView = view.findViewById(R.id.tvLocal)
        private val txtHora: TextView = view.findViewById(R.id.tvHora)

        fun bind(restaurante: RestauranteModel) {
            imgRestaurante.setImageResource(restaurante.fotoURL)
            txtNome.text = restaurante.nome
            txtLocal.text = restaurante.local
            txtHora.text = restaurante.hora
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderRestaurantes {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_lista_restaurante, parent, false)

        return ViewHolderRestaurantes(view)
    }

    override fun onBindViewHolder(holder: ViewHolderRestaurantes, position: Int) {
        val item = dataSetRestaurantes[position]
        holder.bind(item)
        holder.itemView.setOnClickListener { listener(item) }
    }

    override fun getItemCount() = dataSetRestaurantes.size
}


