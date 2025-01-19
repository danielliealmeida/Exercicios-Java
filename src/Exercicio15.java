import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variável para armazenar a soma dos números
        int soma = 0;

        // Laço que vai ler os números até que um número negativo seja digitado
        while (true) {
            System.out.print("Digite um número (digite um número negativo para encerrar): ");
            int numero = scanner.nextInt();  // Lê o número digitado pelo usuário

            // Verifica se o número é negativo
            if (numero < 0) {
                break;  // Encerra o laço se o número for negativo
            }

            // Adiciona o número à soma
            soma += numero;
        }

        // Exibe o resultado da soma
        System.out.println("A soma dos números digitados é: " + soma);

        scanner.close();  // Fecha o scanner
    }
}