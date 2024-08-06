fun main() {
    var inteiro :Int = 19
    val string: String = "Total" // imutável
    var boolean: Boolean = true

    println("Inteiro:$inteiro, String:$string e Boolean:$boolean")

    inteiro = 20
    boolean = !true

    println("Inteiro:$inteiro, String:$string e Boolean:$boolean")

    var doubleInte = inteiro.toDouble()
    doubleInte = 99.99
    boolean = false

    println("Double:$doubleInte, String:$string e Boolean:$boolean")

}