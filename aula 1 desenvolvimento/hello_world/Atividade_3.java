import java.util.Scanner;

public class Atividade_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe  o primeiro número: ");
        double n1 =sc.nextDouble();

        System.out.println("informe  o segundo número: ");
        double n2 =sc.nextDouble();
        
        System.out.println("informe  o segundo número: ");
        double n3 =sc.nextDouble();

        double media = (n1 + n2 + n3)/ 3;

        System.out.println(media);

        sc.close();
    }
}
