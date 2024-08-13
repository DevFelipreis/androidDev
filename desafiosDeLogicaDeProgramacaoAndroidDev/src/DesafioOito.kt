fun main() {
    val valores = mutableListOf<Int>(1000, 657, 1)
    val acumulador = mutableListOf<Int>(99999)

    for (valor in valores) {
        var inserido = false
        for (i in acumulador.indices) {
            if (valor < acumulador[i]) {
                acumulador.add(i, valor)
                inserido = true
                break
            }
        }
        if (!inserido) {
            acumulador.add(valor)
        }
    }
    acumulador.removeAt(acumulador.size - 1)
    println("$acumulador")
}
