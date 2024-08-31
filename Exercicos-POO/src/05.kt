
class Aluno(var nome:String, var matricula:String, var notas:Array<Float>){

    open fun modificarNome(nomeNovo:String){
        nome = nomeNovo
        println("Modificou seu nome para $nomeNovo")
    }

    open fun modificarMatricula(matriculaNova:String){
        matricula = matriculaNova
        println("Modificou sua matrícula para $matriculaNova")
    }

    open fun mediaNotas(media:Array<Float>){

        var qtdNotas = notas.size
        var somaNotas = 0.0
        var mediaNotas = somaNotas / qtdNotas

        for (index in 0 until qtdNotas){
            somaNotas = somaNotas + notas[index]
        }

        for (nota in notas){
            println("Suas notas: $nota")


        }

        if(mediaNotas < 6.0f){
            println("Você está de recuperação com a média final de $mediaNotas")
        }else if(mediaNotas < 4.0f){
            println("Você está reprovado com a média final de $mediaNotas")
        }else{
            println("Você está aprovado com a média final de $mediaNotas")
        }
    }
}

fun main() {
val  aluno = Aluno("Luiz Felipe", "2024-6", arrayOf(3.5f, 8.8f, 9.0f, 6.6f))

    println("${aluno.nome}")
    aluno.modificarNome("João Vitor")
    println("${aluno.matricula}")
    aluno.modificarMatricula("4000-5")
    for (notas in aluno.notas){
        println("${notas}")
    }
    aluno.mediaNotas(arrayOf(6.0f,10.0f,3.7f, 6.8f,9.9f))

}
