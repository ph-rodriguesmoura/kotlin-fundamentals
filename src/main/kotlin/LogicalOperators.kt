fun main() {
    val x = 10
    val y = 5

    // Verifica se x é maior que y
    val resultado1 = x > y  // Resultado: true

    // Verifica se x é igual a y
    val resultado2 = x == y  // Resultado: false

    // Verifica se x é menor ou igual a y
    val resultado3 = x <= y  // Resultado: false

    // Condições (Controle de Fluxo)
    val price = 30000

    if (price > 30000) {
        println("Você ganhou um desconto de 30%")
    } else if (price > 20000) {
        println("Você ganhou um desconto de 20%")
    } else if (price > 10000) {
        println("Você ganhou um desconto de 10%")
    } else {
        println("Valor abaixo do permitido para aplicar desconto")
    }

}

// TODO: Explicar o que foi abordado na aula.

// muito utilizado para validações

// Foi ensinado a utilização de operadores lógicos e o uso de condições para controle de fluxo com if | else;

// Os operadores lógicos e condições tem como funcionalidade trazer um valor booleano e validar se uma condição é..
// true ou false, por Ex.: validar se A é diferente de B.

// O uso do if e else abre um leque vasto de validações que podem ser realizadas, deste algo simples como validar se..
// o item possui mais de 2 caracteres à uma validação de regra de negócio no qual irá calcular o imposto que será..
// inserido caso tal condição seja imposta.