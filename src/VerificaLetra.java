import java.util.Scanner;

public class VerificaLetra {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário informe uma string
        System.out.println("Informe uma string:");
        String input = scanner.nextLine();

        // Fecha o scanner
        scanner.close();

        // Variáveis para contar a ocorrência das letras 'a' e 'A'
        int countLowerCaseA = 0;
        int countUpperCaseA = 0;

        // Converte a string para caracteres individuais e verifica cada um
        for (char c : input.toCharArray()) {
            if (c == 'a') {
                countLowerCaseA++;
            } else if (c == 'A') {
                countUpperCaseA++;
            }
        }

        // Soma as contagens de 'a' e 'A'
        int totalCount = countLowerCaseA + countUpperCaseA;

        // Verifica se a letra 'a' ou 'A' está presente e exibe a quantidade
        if (totalCount > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) ocorre " + totalCount + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não ocorre na string.");
        }
    }
}
