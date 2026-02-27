import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] carros = new String[3];

        // criando uma repetição para exibir as opções que há no progama
        System.out.println("As opções que há no progama: ");
        String [] tabela={"---Cadastrar---","---Listar---","---Alterar---","---Remover---"};
        System.out.println(tabela[0]);
        System.out.println(tabela[2]);
        System.out.println(tabela[3]);



        // preenchendo os dados digitados
        for(int i=0; i<carros.length; i++){
            System.out.println("Digite nome "+(i+1)+ " : ");
            carros[i] = sc.nextLine();
        }

        // Listar
        System.out.println("\nLista atual de carros");
        listar(carros);

        // ALTERAR
        System.out.println("\nDigite a posição para alternar: ");
        int posAlterar = sc.nextInt();
        sc.nextLine();

        if (posAlterar >=0 && posAlterar < carros.length) {
            System.out.println("Digite o novo nome: ");
            carros[posAlterar] = sc.nextLine();
        } else {
            System.out.println("Opção inválida!");
        }


        // Remover

        System.out.println("\ndigite a posição para remover: ");
        int posRemover = sc.nextInt();
        
        if (posRemover >= 0 && posRemover < carros.length) {
            // deslocar elementos
            for (int i = posRemover; i < carros.length - 1; i++) {
                carros[i] = carros[i + 1];
            }
            carros[carros.length - 1] = null;
        } else {
            System.out.println("Opção inválida!");
        }

        System.out.println("\nListar após remoção:");
        listar(carros);

        sc.close();
    }

    // método para listar
    public static void listar(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }
    }

}
