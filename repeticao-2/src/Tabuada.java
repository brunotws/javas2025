public class Tabuada {
    public static void main(String[] args) {
        // Declaração das variáveis
        int num = 5;      // O número da tabuada
        int cont = 1;     // O contador que começa de 1
        int result;       // O resultado da multiplicação

        // Laço "enquanto" para calcular e imprimir a tabuada de 5
        while (cont <= 10) {
            result = num * cont;  // Calcula o resultado da multiplicação
            System.out.println("Resultado: " + num + " * " + cont + " = " + result);
            cont = cont + 1;      // Incrementa o contador
        }
    }
}
