import java.util.Scanner;

public class Arquivo {
    public static void main(String[] args) {
        // Criação do scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Variável para armazenar a escolha do usuário
        String escolha;

        // Laço "for" para exibir o menu repetidamente
        for (int i = 0; i == 0; ) {
            // Exibindo o menu
            System.out.println("Digite: N para Novo arquivo");
            System.out.println("Digite: A para Abrir arquivo");
            System.out.println("Digite: F para Fechar arquivo");
            System.out.println("Digite: S para Sair");

            // Lendo a escolha do usuário
            System.out.print("Digite sua opção: ");
            escolha = scanner.nextLine().toUpperCase(); // Convertendo para maiúsculo para evitar problemas de digitação

            // Verificando a escolha e realizando a ação correspondente
            if (escolha.equals("N")) {
                System.out.println("Novo arquivo criado com sucesso!");
            } else if (escolha.equals("A")) {
                System.out.println("Abrindo arquivo!");
            } else if (escolha.equals("F")) {
                System.out.println("Arquivo fechado com sucesso!");
            } else if (escolha.equals("S")) {
                System.out.println("Obrigado por utilizar o sistema!");
                break;  // Interrompe o laço se a opção S for escolhida
            } else {
                System.out.println("Valor incorreto. Tente novamente.");
            }
        }

        // Fechar o scanner
        scanner.close();
    }
}
