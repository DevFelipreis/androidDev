fun main() {
    var contagem:Int=0
    var contagemDois:Int=20

    while (contagem<=20 && contagemDois<=20 || contagemDois ==0) {
        println("Contagem Um: $contagem")
        contagem += 2
        println("Contagem Dois: $contagemDois")
        contagemDois -= 2
    }

    var string = "Luiz Felipe Pinto dos Reis"
    var index = 0

    while (index < string.length) {
        println(string[index])
        index++
    }

}