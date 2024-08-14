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
            if(!r.hasNext()){
                println("Arquivo vazio")
            }else{
                while (r.hasNextLine()){
                    println(r.nextLine())
                }
                r.close()
            }
        }
    }catch (e: FileNotFoundException){
        println("Erro ao ler o arquivo. Arquivo inexistente")
    }

    println("")
}