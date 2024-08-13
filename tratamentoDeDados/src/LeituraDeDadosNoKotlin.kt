fun main(){
    val n= readLine()
    var num = readLine()?.toInt() ?: 0
    var num2 = readlnOrNull()?.toInt() ?: 0
    var num3 = readlnOrNull()?.toDouble() ?: 0.0
    var num4 = readlnOrNull()?.toFloat() ?: 0.0f
    var num5 = readlnOrNull()?.toBoolean() ?: 0
    println("Tipo string: $n")
    println("Tipo inteiro: $num")
    println("Tipo inteiro: $num2")
    println("Tipo Double: $num3")
    println("Tipo float: $num4")
    println("Tipo boolena: $num5")
}