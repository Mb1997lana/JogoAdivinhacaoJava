import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numSecreto = new Random().nextInt(100);
        int numTentativas = 0;

        System.out.println ("Bem Vindo ao nosso Jogo de Adivinhação!!");

    while (numTentativas < 5) {

            System.out.println (String.format ("Tentativa %d de 5", numTentativas + 1) );
            System.out.println ("Qual é o seu chute?");
            int chute = leitor.nextInt();
            numTentativas++;

            if (chute == numSecreto) {
                System.out.println (String.format ("Parabéns! Você acertou em %d tentativas.", numTentativas) );
                break;
            } else if (chute > numSecreto) {
                System.out.println ("Seu chute é maior que o número secreto! Tente novamente");
            } else {
                System.out.println ("Seu chute é menor que o número secreto! Tente novamente.");
            }

        }
    if (numTentativas == 5) {
        System.out.println ("Game Over!");
    }
    }
}

// Código do instrutor da Alura.
/*public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); // gera um número aleatório entre 0 e 100
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            int numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + tentativas + " tentativas!");
                break; // interrompe o loop while
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == 5) {
            System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + numeroGerado);
        }
    }
}*/