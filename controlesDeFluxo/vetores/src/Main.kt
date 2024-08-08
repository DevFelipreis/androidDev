fun main() {
    vetor()
    vetor2()
}

fun vetor(){
    val numbers = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numbers[6])

    for (i in 0..(numbers.size-1)) {
        if(numbers[i]%2==0){
            println("${numbers[i]} é um número par")
        }else{
            println("${numbers[i]} é um número ímpar")
        }
    }
}

fun vetor2(){
    var n = Array(10,{i->i})
    for(i in n){
        println(n[i])
    }
}
