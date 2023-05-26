import kotlin.system.exitProcess

fun main() {
    // call - Chamando uma função
    helloWorld()

    // É possível chamar mais de uma vez à mesma função
    helloWorld()

    // É possível declarar o valor de uma variável com uma função
    val welcome = welcome()
    println(welcome)

    // Ou imprimir diretamente
    // println() é um exemplo de função que é reutilizada à todo tempo
    println(welcome())

    // Só vai ser executado o que está dentro da função "escope", outra função criada não é possível realizar sua..
    //  chamada de mandeira seperada, irá gerar um erro.
    // escope2()
    escope()

    // Chamando uma função que foi criada de maneira inline | linha única
    inline()

    // Funções com parametrizações, ao chamar ela é necessário informar seu valor;
    ageValidation(17)

    // Função com parametrização e sem tipo de retorno, porém com argumentos nomeados
    isAdmin(name = "Pedro", age = 22, isAdmin = true)

    // Funções repetidas com argumentos diferentes
    loginValidation("email@teste.com", 123456, true)
    loginValidation("email@teste.com", 123458)

    // Função com valor padrão definido
    userValidation(123456)
}

// Função sem retorno
fun helloWorld() {
    println("Hello World!")
}

// Função com retorno
fun welcome(): String {
    return "Welcome To Back!"
}

// Escopo das funções
fun escope() {
    println("Hello Guys!")

    // Funções de Escopo (Rara utilização)
    fun escope2() {
        println(1 + 1)
    }

    // Para chamar essa função deve-se chamar dentro do escopo original
    escope2()
}

// Function inline
fun inline() = println("Funcion Inline")

// Parametrizações de funções
fun ageValidation(age: Int) {
    if (age >= 18) {
        println("PODE Dirigir")
    } else {
        println("PROIBIDO Dirigir")
    }
}

// Argumentos nomeados
fun isAdmin(name: String, age: Int, isAdmin: Boolean) {
    if (age > 18) {
        println("Olá meu nome é $name, tenho $age e sou admin: $isAdmin")
    } else {
        println("Olá meu nome é $name, tenho $age e sou admin: $isAdmin")
    }
}

// Sobrecarga
fun loginValidation(email: String, passaword: Int, isAdmin: Boolean) {
    if (email === "email@teste.com" && passaword === 123456 && isAdmin == true) {
        println("Login ao Painel Administrativo Efetuado")
    } else {
        println("Acesso Negado")
    }
}

fun loginValidation(email: String, passaword: Int) {
    if (email === "email@teste.com" && passaword === 123456) {
        println("Login ao Painel Administrativo Efetuado")
    } else {
        println("Acesso Negado")
    }
}

// Valores padrões
fun userValidation(passaword: Int, email: String = "teste@teste.com") {
  println("Seu email é: $email e sua senha: $passaword")
}

// TODO: Explicar o que foi abordado na aula.

// Foi ensinado que fumções tem o objetivo de organizar o código e reutilizar seus blocos de código quando desejar.

// Toda função pode ou não ter um tipo de retorno (String, Int, Long e Etc..), porém se o tipo não for explicito..
// a função será do tipo Unit, no qual não aguarda um retorno, como a função main.

// O escopo de uma função é delimitado pelas chaves {}, ou seja uma função será tudo aquilo que contém dentro das {}.

// Funções também podem ter parametrizações ou não, no qual será inserida nos parenteses ().

// Ao chamar uma função que possui parâmetros, para ficar mais facil a compreensão da visualização e compreensão..
// dos argumentos a serem passados é possível nomear os argumentos.

// É possível repetir o nome da função para criar outra, porém os argumentos não podem ser os mesmos.

// Em kotlin dentro dos parâmetros das funções é possível deixar um valor default, como por exemplo todos os clientes..
// novos cadastrados terá a senha 123456.