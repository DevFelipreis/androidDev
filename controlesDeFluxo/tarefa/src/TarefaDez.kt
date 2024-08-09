fun main(){
acharNumeroNoVetor()
}

fun acharNumeroNoVetor(){
    val vetor= doubleArrayOf(1.3,4.5,7.8,5.5,8.9,2.3,3.3,7.8,1.0,10.0)
    println("Digite um número para verificar se está na lista")
    val number= readln().toDouble()
    var achadoOuNao=false

    for (i in 0 until vetor.size){
        println(vetor[i])
        if(number == vetor[i]){
           achadoOuNao=true
            break
        }
    }
    if (achadoOuNao) {
        println("Elemento $number achado")
    } else {
        println("Elemento $number não achado")
    }
}