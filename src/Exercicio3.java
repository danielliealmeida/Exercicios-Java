import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Exibe o nome 10 vezes
        for (int i = 1; i <= 10; i++) {
            System.out.println(nome);
        }

        scanner.close();  // Fecha o scanner
    }
}