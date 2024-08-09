fun main() {
    val idade:Int =20
    val idade2:Int=15

    maiorDeidade(idade)
    maiorDeidade(idade2)
}

fun maiorDeidade(idade:Int){
    if(idade>=18) println("É maior de idade") else println("Não é maior de idade")
}
