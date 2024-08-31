class Produto(var nome:String, var preco:Double, var qtd_estoque:Int){

    open fun modificarNome(nomeNovo:String){
        val nomeAntigo = nome
        nome = nomeNovo
        println("Você alterou o nome de $nomeAntigo para $nomeNovo ")
    }

    open fun modificarPreco(precoNovo:Double){
        val precoAntigo = preco
        preco = precoNovo
        println("Você alterou o preço do produto de R$ $precoAntigo reais para $precoNovo reais ")
    }

    open fun saidaEstoque(saida:Int){
        val estoqueAntigo = qtd_estoque
        if(saida > qtd_estoque){
            println("Estoque insuficiente")
        }else if(qtd_estoque > 10){
            preco = preco * 0.60
            println("Parabéns, você ganhou 40% de desconto. Valor unitário $preco")
        }else{
            qtd_estoque = qtd_estoque - saida
            println("Você retirou $saida do estoque. Estoque atualizado $qtd_estoque" +
                    ". Estoque anterior $estoqueAntigo")
        }

    }
}

fun main() {
    val produto = Produto("Playstatio 5", 5000.00, 11)
    val precoFinal = produto.preco * 4


    produto.modificarNome("Xbox")
    produto.modificarPreco(3500.00)
    produto.saidaEstoque(4)

}
