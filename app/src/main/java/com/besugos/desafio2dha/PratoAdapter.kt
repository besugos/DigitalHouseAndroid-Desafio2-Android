package com.besugos.desafio2dha

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PratoAdapter (private val dataSetPratos: List<Prato>, private val listener: (Prato) -> Unit) :
    RecyclerView.Adapter<PratoAdapter.ViewHolderPratos>() {

    class ViewHolderPratos(view: View) : RecyclerView.ViewHolder(view) {
        private val imgRestaurante: ImageView = view.findViewById(R.id.ivPic)
        private val txtNome: TextView = view.findViewById(R.id.tvNomeRestaurante)

        fun bind(restaurante: Prato) {
            imgRestaurante.setImageResource(restaurante.fotoURL)
            txtNome.text = restaurante.nome
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderPratos {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_prato, parent, false)

        return ViewHolderPratos(view)
    }

    override fun getItemCount() = dataSetPratos.size

    override fun onBindViewHolder(holder: PratoAdapter.ViewHolderPratos, position: Int) {
        val item = dataSetPratos[position]
        holder.bind(item)
        holder.itemView.setOnClickListener { listener(item) }
    }

}
