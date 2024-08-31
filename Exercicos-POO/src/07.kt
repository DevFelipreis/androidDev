abstract class MeioDeTransporte(){

    abstract fun mover(veiculo: String):String

    class Carro:MeioDeTransporte(){
        override fun mover(veiculo:String): String {
            return "O $veiculo começou a mover"
        }
        }

    class Aviao:MeioDeTransporte(){
        override fun mover(veiculo:String): String {
            return "O $veiculo começou a voar"
        }
    }

    class Moto:MeioDeTransporte(){
        override fun mover(veiculo:String): String {
            return "O $veiculo começou a andar"
        }
    }

    class Jato:MeioDeTransporte(){
        override fun mover(veiculo:String): String {
            return "O $veiculo ultrapassou a velocidade do som "
        }
    }

    class Quadriciclo:MeioDeTransporte(){
        override fun mover(veiculo:String): String {
            return "O $veiculo não está funcionando "
        }
    }

    class Bicicleta:MeioDeTransporte(){
        override fun mover(veiculo:String): String {
            return "O $veiculo está com o pneu furado "
        }
    }
}

fun main() {
    val carro = MeioDeTransporte.Carro()
    val aviao = MeioDeTransporte.Aviao()
    val moto = MeioDeTransporte.Moto()
    val jato = MeioDeTransporte.Jato()
    val quadriciclo = MeioDeTransporte.Quadriciclo()
    val bicicleta = MeioDeTransporte.Bicicleta()

    println(carro.mover("Carro"))
    println(aviao.mover("Avião"))
    println(moto.mover("Moto"))
    println(jato.mover("Jato"))
    println(quadriciclo.mover("Quadriciclo"))
    println(bicicleta.mover("Bicicleta"))
}
