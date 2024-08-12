package readFileTxt

import java.io.File
import getCarbonEmissions.getCarbonEmissions

fun readFile(): String? {
    val pathFile = "C:\\Users\\felip\\Documents\\ESTUDOS\\Programação\\learning-kotlin\\" +
            "androidDev\\projetoOne\\Arquivo.txt" // change it to your file path
    val file = File(pathFile)

    try {
       return file.readText().takeIf { it.isNotEmpty() }
    } catch (e: Exception) {
        return "Erro ao ler o arquivo: ${e.message}"
    }
}

fun carbonCalculation(): String {
    val body = readFile()

    if (body == null) {
        return "Arquivo vazio ou erro na leitura do arquivo."
    }

    val items = body.split(", ")
    val results = StringBuilder()

    for (scanner in items) {
        val parts = scanner.split(":")
        if (parts.size < 2) {
            results.append("Formato inválido para a entrada: $scanner\n")
            continue
        }

        val name = parts[0].trim().lowercase()
        val amountStr = parts[1].trim()

        val amountKg = try {
            if (amountStr.endsWith("g")) {
                amountStr.replace("g", "").toDouble() / 1000
            } else if (amountStr.endsWith("kg")) {
                amountStr.replace("kg", "").toDouble()
            } else {
                amountStr.toDouble()
            }
        } catch (e: NumberFormatException) {
            results.append("Quantidade inválida para o alimento: $amountStr\n")
            continue
        }

        val emission = getCarbonEmissions(amountKg, name)

        if (emission == 0.0) {
            results.append("Alimento: $name ainda não consta em nosso Banco de Dados\n")
        } else {
            results.append("Alimento: $name, Quantidade: $amountStr, Emissão de carbono: ${emission} kg CO₂e\n")
        }
    }
    return results.toString()
}
