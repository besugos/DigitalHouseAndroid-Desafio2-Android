package com.besugos.desafio2dha.repository

import com.besugos.desafio2dha.model.PratoModel
import com.besugos.desafio2dha.R
import com.besugos.desafio2dha.model.RestauranteModel

class Repository {

    val prato1 = PratoModel(
        R.drawable.aoyama,
        "Salada com molho Gengibre",
        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque " +
                "laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.")

    val prato2 = PratoModel(
        R.drawable.tony,
        "Camarões à moda da casa",
        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque " +
                "laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.")

    val prato3 = PratoModel(
        R.drawable.sisenor,
        "Brunch australiano",
        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque " +
                "laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.")

    val prato4 = PratoModel(
        R.drawable.outbackmoema,
        "Paella mexicana",
        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque " +
                "laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.")

    val rest1 = RestauranteModel(
        (R.drawable.tony),
        "Tony Roma's",
        "Av. Lavandisca, 717 - Indianópolis, São Paulo",
        "Fecha às 22:00",
        prato1

    )
    val rest2 = RestauranteModel(
        R.drawable.aoyama,
        "Aoyama - Moema",
        "Alameda dos Arapanés, 532 - Moema",
        "Fecha às 00:00",
        prato2
    )
    val rest3 = RestauranteModel(
        R.drawable.outbackmoema,
        "Outback - Moema",
        "Av. Moaci, 187, 187 - Moema, São Paulo",
        "Fecha às 00:00",
        prato3
    )
    val rest4 = RestauranteModel(
        R.drawable.sisenor,
        "Sí Señor!",
        "Alameda Jauaperi, 626 - Moema",
        "Fecha às 01:00",
        prato4
    )

}