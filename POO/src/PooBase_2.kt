package PooBase_2

class  Pessoa(val anoNasc:Int, var nome:String){
    var idade = 2023 - anoNasc
    fun saudacao(){
        println("Seja bem-vindo ${this.nome}")
    }
    fun acordar(x:Boolean){
        if(x){
            println("Está acordado")
        } else{
            println("Está dormindo")
        }
    }
}

