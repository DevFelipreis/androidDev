
enum class Prioridade{
    Baixa, Media, Alta
}

enum class Animais{
    gato, cachorro, tucano, papagaio, leopardo
}

enum class Prioridade_2(val v:Int){
    b(0), m(7), a(10)
}

enum class Prioridade_3(val value:Int){
    a(10){
        override fun toString(): String {
            return "Prioridade Alta com o valor $value"
        }
    },
    b(0){
        override fun toString(): String {
           return "Prioridade Baixa com o valor $value"
        }
    },
    c(7){
        override fun toString(): String {
            return "Prioridade Baixa com o valor $value"
        }
    }
}

fun x(p:Prioridade) {

}

fun main(){
       x(Prioridade.Alta)
    for(p in Prioridade.values()){
        println("$p")
    }
    println()
    for(p in Animais.values()){
        println("$p")
    }
    println()
    for(p in Prioridade_2.values()){
        println("${p.v}")
    }
    println()
    for(p in Prioridade_3.values()){
        println("$p")
    }
}