import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner

fun main(){
    readFile()
}

fun readFile(){
    val file = File("C:\\Users\\felip\\Documents\\ESTUDOS\\" +
                             "Programação\\learning-kotlin\\androidDev\\" +
                             "tratamentoDeDados\\src\\Arquivo.txt")
    try {
        Scanner(file).use{r->
            while (r.hasNext()){
                println(r.next())
            }
            r.close()
        }
    }catch (e: FileNotFoundException){
        println("Erro ao ler o arquivo. Arquivo vazio ou inexistente")
    }

    println("")
}