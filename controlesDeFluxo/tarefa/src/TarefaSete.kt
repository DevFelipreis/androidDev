fun main() {
    numerosPrimosOuNao()
}

fun numerosPrimosOuNao() {
    var operacaoAberta = true

    while (operacaoAberta) {
        println("Digite um número:")
        val numero = readln().toInt()

        if (isPrime(numero)) {
            println("$numero é um número primo")
        } else {
            println("$numero não é um número primo")
        }

        println("Deseja digitar outro número? (SIM ou NÃO)")
        val digitarNovamente = readln().toLowerCase()
        operacaoAberta = digitarNovamente == "sim"
    }
    println("Programa encerrado")
}



fun isPrime(number: Int): Boolean {
    if (number <= 1) return false
    if (number == 2) return true
    if (number % 2 == 0) return false

    for (i in 3..Math.sqrt(number.toDouble()).toInt() step 2) {
        if (number % i == 0) return false
    }
    return true
}
