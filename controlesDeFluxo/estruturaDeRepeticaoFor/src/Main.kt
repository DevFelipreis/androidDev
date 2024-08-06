fun main() {

var contagem:Int=0

    println("\n")
   for (i in 1.. 100 step  2){
        println("${i}")
   }

    println("\n")
    for (i in 20 downTo 0 step 4){
        println(i)
    }

    println("\n")
    while (contagem<100){
        contagem+=4
        println("$contagem")
    }

    val string = "Criação de Aplicativo Android"
    println("\n")
    for (i in  string){
        println("$i")
    }
}