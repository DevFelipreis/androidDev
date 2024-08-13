fun main(){
    val number = 2

    if(number >=0 && number%2==0){
        println("$number é par e positivo")
    }else if(number >=0 && number%2!=0){
        println("$number é ímpar e positivo")
    }else if(number <0 && number%2==0){
        println("$number é par e negativo")
    } else{
        println("$number é ímpar e negativo")
    }
}