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
    val y: Double = x.toDouble() // chamo o método .toDouble(), onde converte o Int para Double
    //val z: Double = x          // não funciona, já que estou sobreescrevendo o tipo de dado

}
