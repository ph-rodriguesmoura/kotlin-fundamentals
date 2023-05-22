fun main() {
    // variável mutável, no qual é possível redeclarar à variável posteriormente, mudando o seu estado;
    var product = "iMac"
    product = "iPhone"

    // Não é necessário para redeclarar uma váriavel já existente utilizar a palavra reservada 'var'
    // caso seja utilizada irá ocorrer um erro, pois a variável já foi instanciada. Ex. de erro;
    // var product = "iPhone"

    // Comando println, imprime o valor definido entre '()' no terminal e salta uma linha;
    println(product)

    // variável imutável, no qual não é possível redeclarar posteriormente, nunca mudando seu estado
    val model = 'X'
    println(model)
}