fun main(){
fibonacci()
}

fun fibonacci(){
    val seqFibonacci = mutableListOf(1, 1)
    var index = 1

   while (index <= 8){
       seqFibonacci.add(seqFibonacci[index] + seqFibonacci[index - 1])
       index++
   }

    println("Os oitos primeiros números da sequência de Fibonacci: $seqFibonacci ")
}