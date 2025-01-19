import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar o nome e a idade da pessoa mais nova
        String nomeMaisNovo = "";
        int idadeMaisNova = Integer.MAX_VALUE;  // Inicia com o maior valor possível para garantir que qualquer idade será menor

        // Ler o nome e a idade de 10 pessoas
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome da " + i + "ª pessoa: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();

            // Limpa o buffer do Scanner (para evitar problemas ao ler o próximo nome)
            scanner.nextLine();

            // Verifica se a pessoa atual é a mais nova
            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;  // Atualiza a idade mais nova
                nomeMaisNovo = nome;    // Atualiza o nome da pessoa mais nova
            }
        }

        // Exibe o nome da pessoa mais nova
        System.out.println("A pessoa mais nova é: " + nomeMaisNovo);

        scanner.close();  // Fecha o scanner
    }
}