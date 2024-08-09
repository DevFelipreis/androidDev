fun main() {
    val number = 17
    var index = 2
    var ePrimo = true

    while (index <= number / 2) {
        if (number % index == 0) {
            ePrimo = false
            break
        }
        index++
    }

    if (ePrimo && number > 1) {
        println("$number é um número primo")
    } else {
        println("$number não é um número primo")
    }
}
