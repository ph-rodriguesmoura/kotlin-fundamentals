// 01 - Crie um novo arquivo com uma função main;
fun main() {
    // 02 - Declare uma variável mutável capaz de armazenar seu nome completo;
    var fullName = "Pedro Moura"
    println(fullName)

    // 03 - Declare uma variável de texto sem valor algum;
    val nullable = ""
    println(nullable)

    // 04 - Declare uma variável imutável com o menor tipo de dado possível capaz de armazenar o número que você
    //calça;
    val size: Byte = 41
    println(size)

    // 05 - Declare uma variável capaz de armazenar o PIB do Brasil (1.869.000.000.000);
    val pibBrasil: Long = 1_869_000_000_000
    println(pibBrasil)

    // 06 - Declare uma variável capaz de armazenar a população do Brasil (211.000.000);
    val populationOfBrazil: Int = 211_000_000
    println(populationOfBrazil)

    // 07 - Imprima o valor do PIB per capita;
    val pibPerCapita = pibBrasil / populationOfBrazil
    println(pibPerCapita)

    // 08 - Rode seu programa de maneira que não tenha erros de compilação ou execução;
    println("Executado com Sucesso!")
}