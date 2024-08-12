import java.util.Scanner

fun lerInt() {
    val scanner = Scanner(System.`in`)
    println("Digite um número inteiro: ")
    val num = scanner.nextInt()
    println("você digitou: $num")
    scanner.nextLine()
}

fun lerDouble() {
    val scanner = Scanner(System.`in`)
    println("Digite um número double: ")
    val num = scanner.nextDouble()
    println("você digitou: $num")
    scanner.close()

}

fun lerString() {
    val scanner = Scanner(System.`in`)
    println("Digite um nome: ")
    val num = scanner.next()
    println("você digitou: $num")

}

fun main() {
    lerInt()
    lerDouble()
    lerString()
}

