fun main() {
    var i=0

    while (i<1000){
        if(i==20){
            break
        }
        println("$i ")
        i++
    }

    var string= "Teste de perfil"
    var j=0

    while (j<string.length){
        if(string[j] == 'p'){
            break
        }
        println(string[j])
        j++
    }
    for(i  in 0 .. 20){
        if(1%20==1){
            continue
        }
        println(i)
    }

    var string2= string

    for(i in 0 .. string2.length-1){
        if (string2[i]=='e' || string2[i]=='s'){
            continue
        }
        println(string2[i])
    }
}