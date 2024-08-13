fun main(){
    val notasAluno = doubleArrayOf(5.5,8.9,10.0)
    var somaNotaAluno:Double = 0.0

    for (index in 0 .. notasAluno.size-1){
    somaNotaAluno+=notasAluno[index]
    }

    var mediaNotasAluno:Double=somaNotaAluno/notasAluno.size

    println("Média das notas: $mediaNotasAluno")


}