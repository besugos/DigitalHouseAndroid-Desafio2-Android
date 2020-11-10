package com.besugos.desafio2dha.model

data class RestauranteModel(
    val fotoURL: Int,
    val nome: String,
    val local: String,
    val hora: String,
    val prato: PratoModel
)
