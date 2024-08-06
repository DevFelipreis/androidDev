fun main() {
    println("Digite seu cargo:")
    var cargo:String = readln()

    when(cargo){
        "Diretor"-> println("$cargo -> Salário R$9000")
        "Gerente"-> println("$cargo -> Salário R$3000")
        "Encarregado"-> println("$cargo -> Salário R$2300")
        "Conferente"-> println("$cargo -> Salário R$1700")
        "Separador"-> println("$cargo -> Salário R$1412")
        else -> println("$cargo -> Cargo inválido")
    }
}