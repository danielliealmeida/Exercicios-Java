import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();  // Lê o número digitado pelo usuário

        // Exibe a tabuada do número de 1 a 10
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            // Exibe o resultado da multiplicação
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();  // Fecha o scanner
    }
}