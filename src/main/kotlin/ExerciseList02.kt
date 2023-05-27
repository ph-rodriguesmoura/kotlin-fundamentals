fun main() {
    // Exercise 01
    exercise01()

    // Exercise 02
    val exercise02 = exercise02()
    println("A quantidade de caracteres é: $exercise02")

    // Exercise 03
    val exercise03 = exercise03(5)
    println("A soma de todos os lados é: $exercise03")

    // Exercise 04
    val exercise04 = exercise04(25f)
    val miles = exercise04 / 1.6f
    println("$miles Milhas equivale à: $exercise04 KM")

    // Exercise 05
    exercise05()

    // Exercise 06
    println(exercise02Inline("Pedro"))
    println(exercise03Inline(4))
    println(exercise04Inline(25f))
}

// 01 - Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas,
// minutos e segundos. Saída desejada:
// 2 anos equivalem a:
// 24 meses
// 730 dias
// 17520 horas
// 1051200 minutos
// 63072000 segundos
fun exercise01() {
    val years = 2
    println("2 anos equivalem a: ${years * 12} meses")
    println("${years * 365} dias")
    println("${years * 365 * 24} horas")
    println("${years * 365 * 24 * 60} minutos")
    println("${years * 365 * 24 * 60 * 60} segundos")
}

// 02 - Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres;
fun exercise02(): Int {
    val str = "Pedro"
    return str.length
}

// 03 - Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n);
fun exercise03(size: Int): Int {
    val cube = size * size * size
    return cube
}

// 04 - Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6km);
fun exercise04(miles: Float): Float {
    val km = miles * 1.6f
    return km
}

// 05 - Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras “a” ou “A” por “x”;
fun exercise05() {
    val str = "ARARA"
    println(str.lowercase().replace("a", "X", true))
}

// Sobre as funções criadas nos exercícios 2, 3 e 4. É possível transformá-las em funções de uma única linha?
// Se sim, transforme-as
fun exercise02Inline(str: String): Int = str.length

fun exercise03Inline(size: Int): Int = size * size * size

fun exercise04Inline(km: Float): Float = km * 1.6f