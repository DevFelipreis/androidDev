fun main() {
    numerosReais()
}

fun numerosReais() {
    val reais = listOf(1.5,-3.1,2.71828,3.14159)
    println("Números Reais: $reais")
    numerosRacionais()
}

fun numerosRacionais() {
    val racionais = listOf(1/2,-3/4, 5/1,-2/3,0/1)
    println("Números Racionais: $racionais")
    numerosInteiros()
}

fun numerosInteiros() {
    val inteiros = listOf(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)
    println("Números Inteiros: $inteiros ")
    numerosNaturais()
}

fun numerosNaturais() {
    val naturais = listOf(0, 1, 2, 3, 4, 5)
    println("Números Naturais: $naturais")

}
