fun main(){

    val matriz = arrayOf(
        booleanArrayOf(false,true,true,false),
        booleanArrayOf(false,true,true,false),
        booleanArrayOf(false,true,true,false),
        booleanArrayOf(false,true,true,false)
    )

    val linhas=matriz.size
    val colunas=if (matriz.isNotEmpty()) matriz[0].size else 0

    println("Numero de colunas: $colunas")
    println("Numero de linhas: $linhas")


    for (row in matriz) {
        println(row.joinToString())
    }

}