import java.util.Scanner;

public class Vetd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[3];
        int[] notas = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Informe o nome " + i + ": ");
            nomes[i] = sc.nextLine();

            System.out.print("Informe a nota " + i + ": ");
            notas[i] = sc.nextInt();
            
            // Limpa o buffer para o próximo nextLine() não vir vazio
            sc.nextLine();

            System.out.println("Registrado: " + nomes[i] + " - " + notas[i]);
        }

        System.out.println("\n--- Lista Final ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("O nome " + nomes[i] + " - " + notas[i]);
        }

        sc.close();
    }
}
