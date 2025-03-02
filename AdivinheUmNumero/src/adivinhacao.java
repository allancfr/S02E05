import java.util.Scanner;
import java.util.Random;

public class adivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Solicita ao usuário um número entre 1 e 5
        System.out.print("Adivinhe qual número de 1 a 5 eu estou pensando: ");
        int numeroUsuario = scanner.nextInt();

        // Gera um número aleatório entre 1 e 5
        int numeroAleatorio = random.nextInt(5) + 1;

        // Verifica se o usuário acertou
        if (numeroUsuario == numeroAleatorio) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você errou, o número correto era " + numeroAleatorio);
        }

        scanner.close();
    }
}
