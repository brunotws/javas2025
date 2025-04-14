import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        // Criação do scanner para ler os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        String nome;       // Nome do aluno
        double nota1, nota2, nota3, media; // Notas das provas e a média

        // Leitura dos dados
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite a nota 1: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a nota 3: ");
        nota3 = scanner.nextDouble();

        // Cálculo da média
        media = (nota1 + nota2 + nota3) / 3;

        // Exibição do resultado
        System.out.println("Aluno: " + nome);
        System.out.println("A média da sua nota é: " + media);

        // Fechar o scanner
        scanner.close();
    }
}
