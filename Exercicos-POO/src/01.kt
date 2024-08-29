class Animal(var nome: String, var falar: String, var comida: String, var qtdPatas: Int) {

    open fun imprimir() {
        println("O ${this.nome} está ${this.falar}, gosta de comer ${this.comida} e tem ${this.qtdPatas} patas.")
    }

}

fun main() {

    val cachorro = Animal("Cachorro", "latindo", "ração", 4)
    val gato = Animal("Gato", "miando", "leite", 4)


    cachorro.imprimir()
    gato.imprimir()
}
