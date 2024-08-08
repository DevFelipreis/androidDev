fun main() {

    println(soma(2, 3))
    apresentacao("Luiz Felipe", 32)
    apresentacao("Jorge", 10)

}

fun soma(a:Int, b:Int):Int{
    return a+b
}

fun apresentacao(name:String, age:Int){

    if(age>=18){
        println("Olá, meu nome $name, tenho $age anos e eu posso dirigir")
    }else{
        println("Olá, meu nome $name, tenho $age anos e eu não posso dirigir")
    }

}