fun main(){
    //Faça um programa que entre com três números e coloque em ordem crescente.

    println("Bem vindo, vamos organizar os valores digitados!!!")
    print("Digite o 1º número: ")
    val n1 = readLine()!!.toInt()
    print("Digite o 2º número: ")
    val n2 = readLine()!!.toInt()
    print("Por fim, Digite o 3º número: ")
    val n3 = readLine()!!.toInt()

    var primeiro = 0
    var segundo = 0
    var terceiro = 0


    if(n1 >= n2 && n1 >= n3){
        if(n2>=n3){
            primeiro = n3
            segundo = n2
            terceiro = n1
        }else{
            primeiro = n2
            segundo = n3
            terceiro = n1
        }
    }else if(n2 >= n1 && n2 >= n3){
        if(n1>=n3){
            primeiro = n3
            segundo = n1
            terceiro = n2
        }else{
            primeiro = n1
            segundo = n3
            terceiro = n2
        }
    }else{
        if(n1>=n2){
            primeiro = n2
            segundo = n1
            terceiro = n3
        }else{
            primeiro = n1
            segundo = n2
            terceiro = n3
        }
    }

    print("A ordem cresente dos números informados é $primeiro, $segundo, $terceiro")
}