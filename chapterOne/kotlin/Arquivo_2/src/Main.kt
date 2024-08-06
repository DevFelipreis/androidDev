fun main() {
    var posicaoPersonagemX = 0
    var posicaoPersonagemY = 290
    val posicaoComidaX = 480
    val posicaoComidaY = 290
    var direcao = "Leste"

    while (posicaoPersonagemX != posicaoComidaX || posicaoPersonagemY != posicaoComidaY) {

        println("Digite o movimento (Siga em frente, Gire 90 graus à Direita ou Gire 90 graus à Esquerda):")
        val movimento = readln()

        when (movimento) {
            "Siga em frente" -> {
                when (direcao) {
                    "Norte" -> posicaoPersonagemY += 4
                    "Sul" -> posicaoPersonagemY -= 4
                    "Leste" -> posicaoPersonagemX += 4
                    "Oeste" -> posicaoPersonagemX -= 4
                }
            }
            "Gire 90 graus à Direita" -> {
                direcao = when (direcao) {
                    "Norte" -> "Leste"
                    "Leste" -> "Sul"
                    "Sul" -> "Oeste"
                    "Oeste" -> "Norte"
                    else -> direcao
                }
            }
            "Gire 90 graus à Esquerda" -> {
                direcao = when (direcao) {
                    "Norte" -> "Oeste"
                    "Oeste" -> "Sul"
                    "Sul" -> "Leste"
                    "Leste" -> "Norte"
                    else -> direcao
                }
            }
            else -> println("Movimento inválido")
        }

        println("Direção: $direcao")
        println("Posição X: $posicaoPersonagemX, Posição Y: $posicaoPersonagemY")
    }

    println("Chegou na comida!")
}
