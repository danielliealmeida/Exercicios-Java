import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variável para contar quantos números são pares
        int contadorPares = 0;

        // Laço para ler 20 números
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();  // Lê o número digitado pelo usuário

            // Verifica se o número é par
            if (numero % 2 == 0) {
                contadorPares++;  // Incrementa o contador se o número for par
            }
        }

        // Exibe quantos números são pares
        System.out.println("Quantidade de números pares: " + contadorPares);

        scanner.close();  // Fecha o scanner
    }
}