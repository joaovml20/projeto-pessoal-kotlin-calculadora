fun main() {
    var resposta: Int
    var numero1: Double
    var numero2: Double
    println("Bem-vindo q calculadora!")
    do {
        println("\nEscolha a operaçao a ser realizada:")
        println("Digite 0 para fechar a calculadora")
        println("Digite 1 para somar")
        println("Digite 2 para subtrair")
        println("Digite 3 para multiplicar")
        println("Digite 4 para dividir")
        resposta = readln().toInt()

        when (resposta) {
            1 -> {
                print("\nDigite o valor do primeiro numero: ")
                numero1 = readln().toDouble()
                print("Digite o valor do segundo numero: ")
                numero2 = readln().toDouble()
                println("Resultado da soma: %.2f".format(numero1 + numero2))
                println("Preparando nova operacao...")
            }
            2 -> {
                print("\nDigite o valor do primeiro numero: ")
                numero1 = readln().toDouble()
                print("Digite o valor do segundo numero: ")
                numero2 = readln().toDouble()

                println("Resultado da subtracao: %.2f".format(numero1 - numero2))
                println("Preparando nova operacao...")
            }
            3 -> {
                print("\nDigite o valor do primeiro numero: ")
                numero1 = readln().toDouble()
                print("Digite o valor do segundo numero: ")
                numero2 = readln().toDouble()
                println("Resultado da multiplicacao: %.2f".format(numero1 * numero2))
                println("Preparando nova operacao...")
            }
            4 -> {
                print("\nDigite o valor do primeiro numero: ")
                numero1 = readln().toDouble()
                print("Digite o valor do segundo numero: ")
                numero2 = readln().toDouble()
                println("Resultado da divisao: %.2f".format(numero1 / numero2))
                println("Preparando nova operacao...")
            }
            0 -> {
                println("Calculadora encerrada!")
            }
            else -> {
                println("Operação invalida")
                println("Preparando nova operação...")
            }
        }
    } while (resposta != 0)
}
