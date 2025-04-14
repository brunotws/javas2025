import java.util.Scanner;

public class TiposDeVariaveis {
    public static void main(String[] args) {
        // Criação do scanner para ler os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int a;             // Inteiro
        double b;          // Real (ponto flutuante)
        String c;          // Caractere (usaremos uma String para armazenar uma frase)
        boolean d;         // Booleano

        // Leitura dos valores
        System.out.print("Digite um número inteiro: ");
        a = scanner.nextInt();

        System.out.print("Digite um número real (decimal): ");
        b = scanner.nextDouble();

        scanner.nextLine(); // Limpar o buffer de entrada
        System.out.print("Digite uma frase ou caractere: ");
        c = scanner.nextLine();

        System.out.print("Digite um valor booleano (true ou false): ");
        d = scanner.nextBoolean();

        // Exibição dos valores
        System.out.println("Este é meu número Inteiro: " + a);
        System.out.println("Este é meu número Real: " + b);
        System.out.println("Este é meu caractere: " + c);
        System.out.println("Este é meu booleano: " + d);

        // Fechar o scanner
        scanner.close();
    }
}
