import java.lang.ArithmeticException
import kotlin.IllegalArgumentException
import kotlin.math.sqrt

fun main(){
    val numerador = 10
    val denomonador = 2

    try {
        val res = numerador/denomonador
        println("Redultado da divisão é $res")
    } catch (e: ArithmeticException){
        println("Valor inválido. revise os números digitados")
    }

    val numero:Double=4.0

    try {
        val res2 = sqrt(numero)
        if( numero < 0){
            throw IllegalArgumentException("Número não pode ser negativo")
        }
        println("Resultado é: $res2")
    }catch (e: IllegalArgumentException){
        println("Erro interno")
    }
}