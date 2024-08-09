fun main(){
entradaClient()
}

fun entradaClient(){
    println("Digite 1-para converter horas em minutos")
    println("Digite 2-para converter minutos em horas")
    val entrada= readln().toInt()
    if(entrada==1)converteHorasParaMinutos() else converterMinutosParaHoras()
}

fun converteHorasParaMinutos(){
println("Digite quantas horas quer converter:")
    val horas= readln().toDouble()
    val minutos=horas*60
    println("$horas horas são $minutos minutos")
}

fun converterMinutosParaHoras(){
    println("Digite quantos minutos quer converter:")
    val minutos= readln().toDouble()
    val horas=minutos/60
    println("$minutos minutos são $horas horas")
}