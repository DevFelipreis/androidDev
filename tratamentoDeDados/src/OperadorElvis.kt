fun main(){
var str:String?= null
    if(str==null){
        println("Nada escrito")
    }else{
        println(str)
    }

    str= "Felipe"
    println(str?:"nula")


}