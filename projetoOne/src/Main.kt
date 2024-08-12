import java.io.File

fun lerEProcessarArquivo(caminho: String) {
    val arquivo = File(caminho)
    val conteudo = arquivo.readText()  // Lê todo o conteúdo do arquivo como uma string

    // Separar os itens usando vírgula como delimitador
    val itens = conteudo.split(", ")

    // Processar cada item e extrair o nome e a quantidade
    for (item in itens) {
        val (nome, quantidade) = item.split(":")
        println("Alimento: $nome, Quantidade: $quantidade")
    }
}

fun main() {
    val caminhoDoArquivo = "caminho/para/o/alimentos.txt"
    lerEProcessarArquivo(caminhoDoArquivo)
}
