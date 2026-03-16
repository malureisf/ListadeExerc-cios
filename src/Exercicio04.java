    import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double salario, novoSalario;

        System.out.print("Digite o salário atual: ");
        salario = scanner.nextDouble();

        novoSalario = salario * 1.07;

        System.out.println("Salário original: R$ " + salario);
        System.out.println("Novo salário: R$ " + novoSalario);

        scanner.close();
    }
}

