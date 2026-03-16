Maria Luiza Reis Ferreira 
1261929715
import java.util.Scanner;

    public class Exercicio01 {}

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        double adicao, subtracao, multiplicacao, divisao;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        adicao = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;

        System.out.println("Adição: " + adicao);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        scanner.close();
    
        }