fun main() {
    validadorDeNotas()
}

fun validadorDeNotas(){
    println("Digite a primeira nota igual ou maior que 0 e menor ou igual a 10:")
    val nota1= readln().toDouble()
    println("Digite a segunda nota  igual ou maior que 0 e menor ou igual a 10:")
    val nota2= readln().toDouble()
    println("Digite a terceira nota igual ou maior que 0 e menor ou igual a 10:")
    val nota3= readln().toDouble()
    println("Digite a quarta nota  igual ou maior que 0 e menor ou igual a 10:")
    val nota4= readln().toDouble()
    if (nota1 < 0 || nota1 > 10||nota2 < 0 || nota2 > 10|| nota3 < 0 || nota3 > 10||nota4 < 0 || nota4 > 10){
        println("Nota(s) Inexistente(s)")
        return
    }

    mediaNotas(nota1,nota2, nota3, nota4)
}

fun mediaNotas(nota1:Double, nota2:Double,nota3:Double, nota4:Double){

    var mediaNotas=  (nota1+nota2+nota3+nota4)/4


    if(mediaNotas>= 7.0){
            println("Aprovado. Média: $mediaNotas")
    }else if(mediaNotas< 7.0 && mediaNotas>= 4.0){
            println("Recuperação. Média: $mediaNotas")
    }else{
            println("Reprovado. Média: $mediaNotas")
    }
    }