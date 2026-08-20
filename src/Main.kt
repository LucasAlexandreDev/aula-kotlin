/*
   fun - function
   main() - chama a função main para a sua execulsão
*/

fun main(){

    /*

    Tipos de Impressão;

    println - imprime o texto e pula para a linha de baixo
    print   - imprime o texto e mantem na mesma linha

    */

    print("Aula 01 ")
    println("Hello World")


    // ---| VARIÁVEIS - TIPOS DE DADOS |---

    /*

    Tipos de Variáveis;

    var - o valor pode ser alterado
    val - o valor não pode ser alterado

    */

    // No kotlin os tipos de variáveis são classes
    var idade: Int = 18
    val pi = 3.14
    idade = 20

    var altura = 1.80
    altura = 2.0

    println("Voce possui $idade")
    println("Voce possui $altura")

    // ---| STRING |---

    // Alguns métodos e atributos da classe String (não é necessário colocar o tipo, o próprio kotlin compila)
    val texto = "Bom dia, pessoal!"

    println(texto)
    println(texto.length)
    println(texto.uppercase())
    println(texto.lowercase())
    println(texto.contains("pessoal")) // Faz uma verificaão caso haja o conteúdo dentro das aspas na variável

    // ---| CONCATENAÇÃO |---

    val nome      = "Lucas"
    val idadeNome = 18

    // concatenacão -> utlizado apenas o $ + variável e dentro somente das ""
    println("Bom dia $nome! Logo logo voce fará ${idadeNome + 1} anos")


    // pode ser usado o """ ou \
    val quebraLinha = """
    texto escrito
    em várias linhas
    para teste
    """.trimIndent() // Remove os espaços de identação

    println(quebraLinha)

    val caracter = 'ç' // as aspas ('') serve para identificar que o conteúdo é um carcter
    println(caracter)

    // ---| BOOLEANO |---

    val bloqueado: Boolean = true
    println(bloqueado.not()) // inverte o valor lógico

    // ---| NUMBERS |---

    val ano        = 2026                    // INT
    val populacao  = 7_000_000_000L          // L - LONG
    val pesoFloat  = 75.123456F              // F - FLOAT - 6 casas decimais
    val pesoDouble = 75.12345678912345       // Double    - 15/17 casas decimais

    println(ano)
    println(populacao)
    println(pesoDouble)

    val x: Int = 10
    val y: Double = x.toDouble() // chamo o método .toDouble(), onde converte o Int para Double - casting
    //val z: Double = x          // não funciona, já que estou sobreescrevendo o tipo de dado

    // ---| PRIORIDADE NÚMERICA|--

    // double -> float -> long -> int

    val a: Int = 2
    val b: Double = 5.5
    val resutlado = a * b // Double

    // ---| OPERADORES ARITMÉTICOS |---

    val c = 10
    val d = 3

    println(c + d) // 13
    println(c - d) // 7
    println(c * d) // 30
    println(c / d) // 3
    println(c % d) // 1

    // ---| OPERADORES COMPARAÇÃO |---

    /*
        == - igual
        != - diferente
        > - maior
        < - menor
        >= - maior ou igual
        <= - menor ou igual
     */

    // ---| OPERADORES ATRIBUIÇÃO |---

    /*
        += - valor atual mais novo valor
        -= - valor atual menor novo valor
        *= - valor atual multiplicado pelo novo valor
        /= - valor atual dividido pelo novo valor
        %= - resto da divisão do valor atual

    */


    var operadorAtribuicao: Int = 10

    operadorAtribuicao += 5 // x = x + 5
    println(operadorAtribuicao)

    // ---| OPERADORES LÓGICOS |---

    /*
        && - and
        || - ou
        != - diferente
     */

    // ---| FUNÇÕES |---

    // Como criar uma função

    fun momeDaFuncao(){
        print("Teste nome da funcao")
    }

    // como criar uma função com parâmetro

    fun mandaSalve1(nome: String){
        println("Salve para o(a) $nome")
    }

    // como criar uma função com valores padrões

    fun mandaSalve2(nome: String = "Lucas"){
        println("Salvando $nome")
    }

    // mandaSalve1("Kotlin") - será retornado o valor kotlin
    // mandaSalve2() - será retornado o valor Lucas

    fun mensagemPara(nome: String, idade: Int){
        println("Meus parabéns $nome, pelos $idade anos de vida")
    }

    mensagemPara(nome= "Lucas", idade = 12) // o encaminhamento dos dados não é necessário colocar em ordem

    // como criar uma função com retorno

                                // é colocado obrigátoriamente (:Int) depois das aspas, por causa que o retorno da funcão deve ser um Int
    fun soma(a : Int, b : Int): Int {

        val c = a + b
        return c
    }

    val number1 = 1
    print(soma(a = number1, b = 2)) // pode ser passado no parâmetro uma variável ou valor bruto

    // como criar uma fun

    fun subtracao1(a : Int, b : Int) = a - b // função subtracao está esperando 2 números inteiros e o seu retorno vai ser igual a a - b

    // Como criar uma função em seta
    fun multplicacao(): (Int, Int) -> Int = { a, b -> a * b } // função multiplicacao está esperando 2 números inteiros

    // ---| ESTRUTURA DECIÇÃO |---

    // IF - ELSE

    val idadeHabilitacao = 18

    if(idadeHabilitacao >= 18){
        println("Possuindo a idade de $idadeHabilitacao, você consegue está tirando a sua habilitação")

    }else{
        println("Possuindo a idade de $idadeHabilitacao, você não consegue está tirando a sua habilitação")
    }

    println(idadeHabilitacao)

    val idadeMaioral = 18

    val status = if(idadeMaioral >= 18){

        "Maior de idade"  // não foi realizado nenhuma ação com esse valor - então não foi salvo
        println("teste2")
         "teste"
        print("teste3")

    }else{
        "Menor de idade"
    }

    println(status) // kotlin.Unit - Valor de uma referência (nesse caso o println) não é o valor/resultado e sim o objeto(sempre a última linha)

    // ---| EXPRESSÃO TERNÁRIO |---

    val number = 20

    // : se não
    // se essa condição foi verdadeira, o resultado deve ser "maior" se não deve ser "menor"
    print(if(number >= 18) "maior" else "menor")

    // WHEN - VALOR ÚNICO

    val dia = 3

    when (dia) {

        1 -> println("Domingo")
        2 -> println("Segunda")
        3 -> println("Terça")

        else -> println("Dia Inválido")
    }

    val nota = 9

    // WHEN - MÚLTIPLOS VALORES

    when (nota) {

        9, 10 -> println("Perfeito")
        6, 7 -> println("Bom")
        5 -> println("Regular")

        else -> println("Reprovado")
    }

    // WHEN - SEM ARGUMENTO

    val nota2 = 85

    when {
        nota2 < 60 -> println("Reprovado")
        nota2 < 80 -> println("Bom")

        else -> println("Excelente")
    }

    // ---| NULL SAFETY |---

    var nomePessoa: String = "Lucas"

    // por padrão nenhuna variável pode ser nula
    var nome2 = null

    // ? - Em caso de não haver algum valor para a variável, o valor atribuido será o null
    var nome3: String? = "Lucas"
    nome3 = null

    // primeira forma de fazer uma validação com o null
    if(nome3 != null){
        print(nome3.length)
    }

    // segunda forma de fazer uma validação com o null
    var nome4: String? = null
    println(nome4?.length)


    // ---| COLLECTIONS - ARRAYS |---

                      // [0, 1, 2]
    var numeros = arrayOf(1, 2, 3)

    println(numeros[0])// valor - 1

    numeros[1] = 50     // valor antes - 2 e após 50
    println(numeros[1]) // 50

    //numeros[2] = "Lucas" // não funciona pela incompatibilidade
    println(numeros[5])  // não funciona (index não encontrado)

    // ---| COLLECTIONS - LISTA COMUM (mutável) |---

    var frutas = listOf("banana", "maçã", "maçã")

    println(frutas)
    println(frutas[0]) // banana

    // ---| COLLECTIONS - LISTA COMUM (imutável) |---

    var frutas2 = listOf("banana", "maçã", "laranja")

    println(frutas2.size)               // 3
    println(frutas2.first())            // banana
    println(frutas2.last())             // laranja
    println(frutas2.contains("banana")) // true

}


