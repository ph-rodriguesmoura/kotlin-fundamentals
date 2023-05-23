fun main() {
    // Tipo Inferido
    val salary = 1800.00

    // Tipo Primitivo e Explicito
    val name: String = "Pedro"
    val age: Int = 22
    val product: String = "iMac"

    println(name::class)
    println(age::class)
    println(product::class)
    println(salary::class)
}

// TODO: Explicar o que foi abordado na aula.

// Foi ensinado alguns tipos de dados em Kotlin como: double, int, string, no qual os mesmos podem ser de maneira..
// "explicita" no qual irá informar qual o tipo de dado da variável, e declarar de maneira "Inferida" no qual..
// não tem a necessidade de deixar explicito o tipo, pois o Kotlin automaticamente compreende qual o tipo do dado;

// O atributo class, serve para imprimir no console qual o tipo de dado que a variável possui;