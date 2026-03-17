import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int caixaA;
        int caixaB;
        int limite;
        int soma;

        System.out.print("Digite o peso da caixa A: ");
        caixaA = teclado.nextInt();

        System.out.print("Digite o peso da caixa B: ");
        caixaB = teclado.nextInt();

        System.out.print("Digite o limite do elevador: ");
        limite = teclado.nextInt();

        soma = caixaA + caixaB;

        if (soma < limite) {
            System.out.println("Soma (" + soma + ") é menor que o limite (" + limite + "). Operação segura.");
        } else {
            System.out.println("Soma (" + soma + ") maior ou igual ao limite (" + limite + "). Alerta de sobrecarga!");
        }

        teclado.close();
    }
}

