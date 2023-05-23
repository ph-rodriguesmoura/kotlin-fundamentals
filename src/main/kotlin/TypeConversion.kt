fun main() {
    // Padrão Camel Case na declaração de variáveis
    val lastPrice = 22.90
    println("Tipo de dado Original: ${lastPrice::class}")

    // Convertendo o tipo de dado
    val value = lastPrice.toInt()
    println("Tipo de dado Convertido: ${value::class}")

    // Conversão Direta
    println("Tipo de dado Convertido Direto: ${value.toShort()::class}")
    println("Tipo de dado Original: ${value::class}")
}

// TODO: Explicar o que foi abordado na aula.

// Foi explicado o padrão Camel Case, no qual consiste em uma boa prática a criação de variáveis "destaManeiraEscrita"..
// onde a primeira letra consiste em ser minuscula e todas as outras primeiras letras serem maisculas;

// Ensinado a fazer a conversão do tipo de dados com a instrução ".toType()" Ex.: lastPrice.toInt()
// no qual o fluxo de alocação de memoria grava o valor da variável lastPrice, inseri o valor na variável value..
// onde é realizada a conversão e na saida já apresenta o valor convertido.

// É possível realizar a conversão de dado no output porém caso seja necessário inicializar essa variável em..
// outro momento, a variável estará com o tipo dado original que lhe foi atribuido.