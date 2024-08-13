import kotlin.math.pow

fun main(){
    var altura:Double = 1.72
    var peso:Double = 80.0
    val calculoIMC:Double= peso / altura.pow(2)

    when {
        calculoIMC < 18.6 -> println("Abaixo do peso")
        calculoIMC in 18.6..24.9 -> println("Peso ideal (parabéns)")
        calculoIMC in 25.0..29.9 -> println("Levemente acima do peso")
        calculoIMC in 30.0..34.9 -> println("Obesidade grau I")
        calculoIMC in 35.0..39.9 -> println("Obesidade grau II (severa)")
        calculoIMC >= 40.0 -> println("Obesidade grau III (mórbida)")
        else -> println("Valor inválido")
    }

}