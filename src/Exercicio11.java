import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variável para contar quantos números são maiores que 8
        int contador = 0;

        // Laço para ler 20 números
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();  // Lê o número digitado pelo usuário

            // Verifica se o número é maior que 8
            if (numero > 8) {
                contador++;  // Incrementa o contador se o número for maior que 8
            }
        }

        // Exibe quantos números são maiores que 8
        System.out.println("Quantidade de números maiores que 8: " + contador);

        scanner.close();  // Fecha o scanner
    }
}