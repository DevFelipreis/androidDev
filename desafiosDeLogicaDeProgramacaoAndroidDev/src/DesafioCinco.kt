fun main(){
    var salarioMinimo:Double = 1_293.20
    var salarioFuncionário:Double = 10_000.99
    val calculoQtdSalarioMinimoGanha:Double = salarioFuncionário/salarioMinimo
    var pluraOuNao:String = if(calculoQtdSalarioMinimoGanha>1) "salários" else "salário"

    println("O funcionário ganha $calculoQtdSalarioMinimoGanha $pluraOuNao")

}