import kotlin.ArithmeticException
import kotlin.IllegalArgumentException
import kotlin.math.sqrt

fun main(){

    try {
        var s: String? = null
        s = "Felipe"
        println("O tamanho da string é: ${s.length}")

        var a:Int=20/2
        println("O resultado é: $a")

        var b:Double= 9.0
        var c:Double = sqrt(b)
        if(b<0){
            throw IllegalArgumentException("Não existe raiz de número negativo")
        }

        var x=1
        if(x==1){
            throw Exception("O valor de x não pode ser 1")
        }
    }catch (e: NullPointerException){
        println("A variável está vazia")
    }catch (e: ArithmeticException){
        println("Não existe divisão por zero")
    }catch (e: IllegalArgumentException){
        println("Não existe raiz de número negativo")
    }catch (e: Exception){
        println("Exceção mais geral: ")
        println(e.message)
    } finally {
        println("Executando o finally")
    }
    println("Final do programa")
}