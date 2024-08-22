
class Animal_(var especie:String){
    var fala: String = ""

    init {
        fala = if(especie.lowercase() == "cachorro"){
            "auaua"
        }else if(especie.lowercase() == "gato"){
            "miauuuu"
        }else{
            ""
        }
    }
    init {
        println(fala)
    }
    fun falar(){
        println(fala)
    }
}

fun main(){
    val animal = Animal_("cachoro")
    Animal_("Gato").falar()
    Animal_("Cachorro").fala
}

