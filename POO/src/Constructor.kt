class Silvestre(var nome:String){
    var atk = 0
    constructor(nome: String, atk:Int):this(nome){
        this.atk=atk
    }

    fun Ap(){
        println("Meu animal silvestre é $nome e seu ataque é $atk")
    }
}

fun main(){
    val s1 = Silvestre("macaco", 40)
    val s2  = Silvestre("sapo", 10)
    s1.Ap()
    s2.Ap()
}