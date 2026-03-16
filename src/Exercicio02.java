import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, y, resto;

        System.out.print("Digite X: ");
        x = scanner.nextInt();

        System.out.print("Digite Y: ");
        y = scanner.nextInt();

        resto = x % y;

        System.out.println("O resto da divisão de " + x + " por " + y + " é: " + resto);

        scanner.close();
    }
}