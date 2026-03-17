    import java.util.Scanner;

public class PotenciaNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            int quadrado = numero * numero;
            System.out.println("O número " + numero + " é par. O seu quadrado é " + quadrado + ".");
        } else {
            int cubo = numero * numero * numero;
            System.out.println("O número " + numero + " é ímpar. O seu cubo é " + cubo + ".");
        }

        scanner.close();
    }
}

