import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        // Criação do scanner para ler os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        String nome;        // Nome do vendedor
        double salario, vendas, salarioFinal;  // Salário fixo, vendas e salário final

        // Leitura dos dados
        System.out.print("Digite o nome do funcionário: ");
        nome = scanner.nextLine();

        System.out.print("Digite o valor do salário fixo: ");
        salario = scanner.nextDouble();

        System.out.print("Digite o valor das vendas efetuadas: ");
        vendas = scanner.nextDouble();

        // Cálculo do salário final (salário fixo + comissão de 15%)
        salarioFinal = (vendas * 0.15) + salario;

        // Exibição do resultado
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário fixo: " + salario);
        System.out.println("Salário final (incluindo comissão): " + salarioFinal);

        // Fechar o scanner
        scanner.close();
    }
}
