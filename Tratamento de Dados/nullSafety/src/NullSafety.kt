fun main() {
    var string:String?=null // Lotlin identifica e assume o tratamento de erro
    string = "Testando minha string"
    println(string!!.length) //Eu assumo o risco
    println("Testando meu code")
}