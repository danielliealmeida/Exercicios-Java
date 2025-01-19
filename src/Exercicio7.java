import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variável para armazenar a soma das idades
        int somaIdades = 0;

        // Ler a idade de 20 pessoas e somá-las
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();  // Lê a idade digitada pelo usuário
            somaIdades += idade;  // Adiciona a idade à soma total
        }

        // Calcula a média das idades
        double mediaIdades = somaIdades / 20.0;  // Dividido por 20.0 para garantir o cálculo com precisão decimal

        // Exibe a média das idades
        System.out.println("A média das idades das 20 pessoas é: " + mediaIdades);

        scanner.close();  // Fecha o scanner
    }
}