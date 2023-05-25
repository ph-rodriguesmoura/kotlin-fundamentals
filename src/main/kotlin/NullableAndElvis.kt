fun main() {
    // Nullable
    var product: String? = "iMac"
    product = null
    println(product)

    // Validando se objeto é null
    var street: String? = null
    if (street != null) {
        val qtdChar = street.length
        println(qtdChar)
    } else {
        println(street)
    }

    // Adicionando a ? após o objeto, se chegar no objeto e for null não prossegue, encerrando e retornando null
    // Por length ser uma propriedade de uma string, se a string não existe a propriedade não é utilizada, logo..
    // Parando no ponto de interrogação;
    val qtdChar2 = street?.length
    println(qtdChar2)

    // Adiconando controle de fluxo na variavel
    val qtdChar3 = if (street != null) street.length else 0
    println(qtdChar3)

    // Operador Elvis
    val qtdChar4 = street?.length ?: 0
    println(qtdChar4)

    val qtdChar5: Int? = null
    println(qtdChar5)
}

// TODO: Explicar o que foi abordado na aula.

// Uma variavel quando informada o seu tipo, de forma obrigatória ela espera um valor, mas é possível informar que..
// ela pode receber um valor nulo (null) adicionando uma ? após informar o tipo do objeto, este tipo de uso é bastante..
// utilizado em casos que o usuário final vai preencher um formulário de login e algum campo não é obrigatório.

// Com controle de fluxo é possível validar se os objeto é nulo e ganhar bastante otimização nas validações.