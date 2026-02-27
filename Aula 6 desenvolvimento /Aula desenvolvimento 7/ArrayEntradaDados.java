import java.util.Scanner;

public class ArrayEntradaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        // definindo quantos quer
        System.out.println("Quantos nomes deseja inserir? ");
        int tamanho = scanner.nextInt();
        scanner.nextLine(); // separando a linha

        // criando a quantidade que o usúsario quer
        String[] nomes = new String[tamanho];

        // preenchendo o array com os dados digitados
        for (int i=0; i<nomes.length; i++){
            System.out.println("Digite o nome "+(i+1)+ " : ");
            nomes[i] = scanner.nextLine();
        }

        // exibindos dados armazenados no array
        System.out.println("\nNomes digitados: ");
        for (int i = 0; i<nomes.length; i++){
            System.out.println("Nome na posição "+i+": "+nomes[i]);
        }
        scanner.close();

    }
}
