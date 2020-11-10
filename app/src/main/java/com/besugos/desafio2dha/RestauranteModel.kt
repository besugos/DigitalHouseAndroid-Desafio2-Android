package com.besugos.desafio2dha

data class RestauranteModel(
    val fotoURL: Int,
    val nome: String,
    val local: String,
    val hora: String,
    val prato: PratoModel
)
