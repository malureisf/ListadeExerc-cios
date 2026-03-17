 import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int somaPares = 0;
        int contadorPares = 0;
        int numero;

        System.out.println("Digite os números (digite 0 para encerrar):");

        while (true) {
            numero = scanner.nextInt();

            // Condição de parada: se for 0, encerra o loop
            if (numero == 0) {
                break;
            }

            // Verifica se o número é par (resto da divisão por 2 é zero)
            if (numero % 2 == 0) {
                somaPares += numero;
                contadorPares++;
            }
        }

        // Validação para evitar divisão por zero, conforme a dica
        if (contadorPares > 0) {
            double media = (double) somaPares / contadorPares;
            System.out.printf("Foram processados %d números pares. A média é: %.2f%n", contadorPares, media);
        } else {
            System.out.println("Nenhum número par foi inserido. Média não calculada.");
        }

        scanner.close();
    }
}

