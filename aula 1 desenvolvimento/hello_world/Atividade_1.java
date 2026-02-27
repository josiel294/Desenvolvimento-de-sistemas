import java.util.Scanner;

public class Atividade_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe  o primeiro número: ");
        double n1 =sc.nextDouble();

        System.out.println("informe  o segundo número: ");
        double n2 =sc.nextDouble();

        double soma = n1 + n2;
        double subtracao = n1 - n2;
        double divisao = n1 / n2;
        double multiplcacao = n1 * n2;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.printf("%.2f%n", divisao);
        System.out.println(multiplicacao);

        sc.close();

    }
}
