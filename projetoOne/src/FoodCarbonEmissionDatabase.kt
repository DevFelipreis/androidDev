package getCarbonEmissions

fun getCarbonEmissions(amount_kg: Double, type: String): Double {
    val emissionFactor = when (type.lowercase()) {
        "arroz" -> 2.7
        "feijão" -> 0.7
        "batata" -> 0.3
        "frango" -> 6.0
        "carne bovina" -> 27.0
        "leite" -> 1.0
        "maçã" -> 0.5
        "banana" -> 0.4
        "tomate" -> 0.9
        "alface" -> 0.2
        "couve" -> 0.6
        "cenoura" -> 0.4
        "peixe" -> 5.0
        "ovo" -> 4.5
        "pão" -> 1.3
        "queijo" -> 7.0
        "manteiga" -> 9.0
        "bacon" -> 12.0
        "hamburguer" -> 11.0
        "batata frita" -> 3.5
        "pizza" -> 7.5
        "macarrão" -> 1.1
        "frutas cítricas" -> 0.6
        "abóbora" -> 0.3
        "abacate" -> 1.2
        "morango" -> 0.5
        "kiwi" -> 0.8
        "pera" -> 0.6
        "uva" -> 0.7
        "cabelinho" -> 0.5
        "espinafre" -> 0.4
        "berinjela" -> 0.7
        "chuchu" -> 0.2
        "mandioca" -> 0.5
        "pimentão" -> 0.9
        "cebola" -> 0.6
        "alho" -> 0.8
        "salsinha" -> 0.3
        "coentro" -> 0.3
        "salsichão" -> 8.0
        "feijão preto" -> 0.8
        "feijão branco" -> 0.7
        "grão-de-bico" -> 0.6
        "lentilha" -> 0.7
        "queijo minas" -> 7.2
        "queijo parmesão" -> 9.0
        "requeijão" -> 5.5
        "iogurte" -> 2.5
        "suco de laranja" -> 0.7
        "café" -> 1.5
        "chá" -> 0.4
        else -> 0.0
    }

     return amount_kg * emissionFactor

}
