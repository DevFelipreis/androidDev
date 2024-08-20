
import PooBase_2.Pessoa

fun main() {
    var pessoa: Pessoa = Pessoa(1992, "Felipe")
    println(pessoa.anoNasc)

    println("você tem ${pessoa.idade}")
    pessoa.saudacao()
    pessoa.acordar(true)
    pessoa.acordar(false)
}