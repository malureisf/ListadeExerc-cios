import java.util.Scanner;

public class Exercício03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double COTACAO = 4.95;
        double dolar, real;

        System.out.print("Digite o valor em dólar: ");
        dolar = scanner.nextDouble();

        real = dolar * COTACAO;

        System.out.println("Valor convertido: R$ " + real);

        scanner.close();
    }
}