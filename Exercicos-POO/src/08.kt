private  class Funcionario(var nome:String,
     var salario:Double,
     var matricula:String,
     var cargo:String,
     var produtivida:Double){

    fun mudarNome(nomeNovo:String):String{

        if (nomeNovo == ""){
            return "Não houve alterações no nome"
        }
        nome = nomeNovo
        return  "Você alterou o nome para $nomeNovo"

    }
    fun mudarSalario(salarioNovo:Double):String{
        if (salarioNovo == 0.0){
            return "Não houve alterações no salário"
        }
        salario = salarioNovo
        return "Você alterou o salário para $salarioNovo"
    }
    fun aumentoSalario():String{
        if(produtivida > 60){
            salario *= 1.05
            return "Você ganhou um aumento de salário de 5%. Salário atual: $salario"
        }else{
            return "Não houve aumento de salário"
        }
    }
    fun mudarMatricula(matriculaNova:String):String{
        if (matriculaNova == ""){
            return "Não houve alterações na matrícula"
        }
        matricula= matriculaNova
        return "Você alterou a matrícula para $matriculaNova"
    }
    fun mudarCargo(cargoNovo:String):String{
        if (cargoNovo == ""){
            return "Não houve alterações na matrícula"
        }
        cargo = cargoNovo
        return "Você alterou o cargo para $cargoNovo"
    }

    fun exibirInformacoes(
        nome:String=this.nome,
        salario:Double=this.salario,
        matricula:String=this.matricula,
        cargo:String=this.cargo,
        produtivida:Double=this.produtivida
    ):String{
        return """
            Nome:$nome,
            Salário: $salario,
            Matrícula: $matricula,
            Cargo: $cargo,
            Produtividade: $produtivida
            
        """.trimIndent()
    }

}



fun main() {
    val funcionario = Funcionario("Luiz Felipe", 5000.00, "2024-04", "Gerente", 61.0)

    println("____________Não Atualizado_____________")
    println(funcionario.exibirInformacoes())
    println(funcionario.mudarNome(""))
    println(funcionario.mudarSalario(0.0))
    println(funcionario.mudarMatricula(""))
    println(funcionario.mudarCargo("Diretor"))
    println(funcionario.aumentoSalario())
    println("____________Atualizado_____________")
    println(funcionario.exibirInformacoes())
}
