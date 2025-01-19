import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variável para contar quantas pessoas são maiores de idade
        int maioresDeIdade = 0;

        // Ler a idade de 20 pessoas e verificar se são maiores de idade
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();  // Lê a idade digitada pelo usuário

            // Verifica se a pessoa é maior de idade
            if (idade >= 18) {
                maioresDeIdade++;  // Incrementa a contagem de maiores de idade
            }
        }

        // Exibe o total de pessoas maiores de idade
        System.out.println("O número de pessoas maiores de idade é: " + maioresDeIdade);

        scanner.close();  // Fecha o scanner
    }
}