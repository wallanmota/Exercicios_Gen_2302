fun main() {
    //Faça um programa que receba três inteiros e diga qual deles é o maior.

    var maior: Int = 0

    println("Bem vindo!!!")
    print("Digite o 1º número: ")
    val n1 = readLine()!!.toInt()
    print("Digite o 2º número: ")
    val n2 = readLine()!!.toInt()
    print("Por fim, Digite o 3º número: ")
    val n3 = readLine()!!.toInt()

    maior = n1
    if(maior < n2){
        maior = n2
    }
    if(maior < n3){
        maior = n3
    }
    println("O maior número digitado foi o: $maior")

}