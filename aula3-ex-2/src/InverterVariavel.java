import java.util.Scanner;

public class InverterVariavel {
    public static void main(String[] args) {
        // Criação do scanner para ler os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int A, B, IvertidaA, IvertidaB;

        // Leitura dos valores de A e B
        System.out.print("Digite um número inteiro para A: ");
        A = scanner.nextInt();

        System.out.print("Digite um número inteiro para B: ");
        B = scanner.nextInt();

        // Troca dos valores
        IvertidaA = B;
        IvertidaB = A;

        // Exibição dos valores invertidos
        System.out.println("O número invertido de A é: " + IvertidaA);
        System.out.println("O número invertido de B é: " + IvertidaB);

        // Fechar o scanner
        scanner.close();
    }
}
