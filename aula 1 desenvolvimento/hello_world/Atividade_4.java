import java.util.Scanner;

public class Atividade_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("informe  o valor da força aplicada: ");
        double f =sc.nextDouble();
        
        System.out.println("informe o valor da distância percorrida");
        double d =sc.nextDouble();

        double resultado = f*d;

        System.out.println("O trabalho realizado é: "+resultado);
        sc.close();
        
    }


}
