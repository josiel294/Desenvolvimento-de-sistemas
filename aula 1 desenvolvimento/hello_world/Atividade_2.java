import java.util.Scanner;

public class Atividade_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe  o primeiro número: ");
        double n1 =sc.nextDouble();

        System.out.println("informe  o segundo número: ");
        double n2 =sc.nextDouble();

        double media_aritimetica = (n1 + n2 )/ 2;
        
        System.out.println(media_aritimetica);

        sc.close();
    }
    
}
