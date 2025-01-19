import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variável para armazenar a soma dos números
        int soma = 0;

        // Ler 10 números e somá-los
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();  // Lê o número digitado pelo usuário
            soma += numero;  // Adiciona o número à soma
        }

        // Exibe a soma total dos números
        System.out.println("A soma dos 10 números é: " + soma);

        scanner.close();  // Fecha o scanner
    }
}