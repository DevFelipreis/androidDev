class Planeta(var nome:String){
    private  var id=1
    var tamanho = 1000
    var fala = "Terra"

        get(){
            println("Acessando GET")
            return  field
        }

        set(value){
            println("Acessando o Field")
            field = value
        }
}

class Planet_2(){
    var nome : String = ""
        get(){
            println("Meu valor é ${field}")
            return  field
        }

        set(value){
            if(value == ""){
                println("Todo o planeta tem um nome")
            }else{
                field = value
            }
        }
}


fun main(){
    var p: Planeta = Planeta("Terra")
           println("Tamanho: ${p.tamanho}")
    var a: Planeta = Planeta("Marte")
    a.fala
    a.fala = " Novo Planeta Marte"
    var p2: Planet_2 = Planet_2()
    p2.nome = ""
    println(p2.nome)
    p2.nome= "Júpeter"
    println(p2.nome)
}