import java.util.Scanner;

public class Atividade_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o seu peso: ");
        double peso =sc.nextDouble();

        System.out.println("informe a sua altura: ");
        double altura =sc.nextDouble();

        double imc = peso / (altura * altura);
        
        System.out.println("Seu IMC é: "+imc);

        sc.close();
    }
}
