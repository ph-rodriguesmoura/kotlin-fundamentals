fun main() {
    // Formatação simples de salto de linha
    val message = "Olá Pedro.\nSeu pedido foi aprovado!"

    // Propriedade para identar o objeto STRING
    val welcome = """
        Bem vindo de volta Pedro.
        Seu carrinho de compras lhe espera!
    """.trimIndent()

    // Propriedade para realizar à adição de um novo caracter na formatação
    val csv = """
        Text1,
        Text2
    """.replaceIndent(";")

    // Concatenação
    val name = "Pedro"
    val age = 22
    val price = 19.90

    println(message)
    println(welcome)
    println(csv)
    println("Olá, " + name + ". Sua idade é " + age) // Depreciado, fica um código ilegivel
    println("Olá, $name. Sua idade é $age e o preço do seu produto é $price")
    println("Olá, ${name.uppercase()}. Sua idade é ${age + 10} e o preço do seu produto é $price")
}

// TODO: Explicar o que foi abordado na aula.

// indent muito utilizado para criar relatórios, pdf, csv e etc..
// possivel realizar expressões dentro da formatação utilizando as chaves {} no qual é possível utilizar propriedades

// Foi ensinado alguns tipos de formatação de texto, como o \n que serve para saltar uma linha dentro do objeto STRING..
// propriedade ..Indent() no qual serve para identar o texto para que não possua muitas linhas de espaço, no qual..
// tem bastante uso para criação de relatórios em Excel por exemplo.

// Concatenação é o ato de unir ou "somar" objetos, no qual a maneira utilizado o operador aritmetico + está em desuso..
// a maneira KOTLIN de se realizar é adicionando o $ antes do abjeto, no qual não implica a necessidade do operadpr +..
// é possível também realizar o uso de propriedades na concatenação dos objetos, utilizando as chaves {} após o $.