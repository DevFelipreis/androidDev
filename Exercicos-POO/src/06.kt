abstract class Forma {

    abstract fun calcular_area(): Double

    class Quadrado(val lado_1: Double, val lado_2: Double) : Forma() {
        override fun calcular_area(): Double {
            return lado_1 * lado_2
        }
    }

    class Circulo(val raio: Double) : Forma() {
        override fun calcular_area(): Double {
            return Math.PI * raio * raio
        }
    }

   class Triangulo(val base: Double, val altura: Double) : Forma() {
        override fun calcular_area(): Double {
            return base * altura / 2
        }
    }
}

fun main() {
    val quadrado = Forma.Quadrado(1.0, 2.7)
    val circulo = Forma.Circulo(5.0)
    val triangulo = Forma.Triangulo(10.0, 5.0)

    println("Área do quadrado: ${quadrado.calcular_area()}")
    println("Área do círculo: ${circulo.calcular_area()}")
    println("Área do triângulo: ${triangulo.calcular_area()}")
}
