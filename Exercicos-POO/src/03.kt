class ContaBancaria(var saldo:Float, var titular:String){

     open fun depositar( deposito:Float):Float{
         if(deposito > 10_000.00f){
             println("Olá. $titular. Limite de depósito diário ultrapassado")
             return saldo
         }else{
             saldo = saldo+deposito
             println("Olá. $titular. Você depositou $deposito")
             return saldo
         }
     }

     open fun sacar(sacar:Float){
         if(sacar <= saldo){
             saldo = saldo - sacar
             println("Seu saldo é ${this.saldo}")
         }else if(sacar > 50_000.00f){
             saldo = saldo - sacar
             println("Olá. $titular. Limite de saque diário ultrapassado")
         }else{
             println("Olá. $titular. Saldo insufuciente")
         }

     }

     open fun get_saldo(){
         println("Olá. $titular. Seu saldo é ${this.saldo}")
     }

 }

fun main() {
val contaBancaria = ContaBancaria(50f, "Luiz Felipe")
    contaBancaria.get_saldo()
    contaBancaria.depositar(10_000.00f)
    contaBancaria.sacar(4_000.00f)
    contaBancaria.get_saldo()

}
