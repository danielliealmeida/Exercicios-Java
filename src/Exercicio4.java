import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Solicita ao usuário que digite o número N
        System.out.print("Digite o número de vezes para exibir o nome: ");
        int N = scanner.nextInt();

        // Exibe o nome N vezes
        for (int i = 1; i <= N; i++) {
            System.out.println(nome);
        }

        scanner.close();  // Fecha o scanner
    }
}