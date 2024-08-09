fun main() {
    val number = 17
    var index = 2
    var ehPrimo = true

    while (index <= number / 2) {
        if (number % index == 0) {
            ehPrimo = false
            break
        }
        index++
    }

    if (ehPrimo && number > 1) {
        println("$number é um número primo")
    } else {
        println("$number não é um número primo")
    }
}
