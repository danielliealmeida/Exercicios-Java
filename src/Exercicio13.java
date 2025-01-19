import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variável para contar quantos números estão entre 0 e 100
        int contador = 0;

        // Laço para ler 20 números
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();  // Lê o número digitado pelo usuário

            // Verifica se o número está entre 0 e 100 (inclusive)
            if (numero >= 0 && numero <= 100) {
                contador++;  // Incrementa o contador se o número estiver nesse intervalo
            }
        }

        // Exibe quantos números estão entre 0 e 100
        System.out.println("Quantidade de números entre 0 e 100: " + contador);

        scanner.close();  // Fecha o scanner
    }
}