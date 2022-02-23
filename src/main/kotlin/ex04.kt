import kotlin.math.sqrt

fun main(){
    /*
    Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
    Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
     */
    println("Bem vindo!!!")
    print("Digite um número: ")
    val num = readLine()!!.toInt()

    if(num % 2 == 0){
        var raiz = sqrt(num.toDouble())
        println("O número $num é PAR e sua raiz quadrada é ${"%.2f".format(raiz)}")
    }else{
        println("O número $num é IMPAR e seu valor elevado ao quadrado é ${num * num}")
    }
}