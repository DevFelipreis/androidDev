 class Carros(var consumoDeGasolina:Int,
                      var cor:String,
                      var tipoDoMtor:String,
                      var marca:String,
                      var odômetro:Int){

    open fun verificarConsumos(){
        if(this.consumoDeGasolina >= 60){
            println("Marca: ${this.marca}, cor: ${this.cor}, tipo de motor: ${this.tipoDoMtor}," +
                    "odômentro: ${this.consumoDeGasolina} não é econômico")
        }else{
            println("Marca: ${this.marca}, cor: ${this.cor}, tipo de motor: ${this.tipoDoMtor}," +
                    "odômentro: ${this.consumoDeGasolina} é econômico")
        }
    }

     companion object {
         fun melhorCustoBeneficio(carros: List<Carros>) {
             val melhorCarro = carros.minByOrNull { it.consumoDeGasolina }
             println("${melhorCarro?.marca} tem o melhor custo-benefício com consumo de gasolina de" +
                     " ${melhorCarro?.consumoDeGasolina} litros por km/2.")
         }
     }
}

fun main() {
    val fiat = Carros(10, "Preto", "1.0", "Fiat", 3)
    val ferrari = Carros(80, "Vermelho", "V8", "Ferrai", 8)
    val  mercedes = Carros(60, "Prata", "V7", "Mercedes", 6)
    val carros = listOf(fiat, ferrari, mercedes)

    fiat.verificarConsumos()
    ferrari.verificarConsumos()
    mercedes.verificarConsumos()
    Carros.melhorCustoBeneficio(carros)

}
