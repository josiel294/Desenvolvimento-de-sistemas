import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        for(int i=0; i<3; i++){
            System.out.println("Informe o nome: "+(i+1));
            nomes.add(sc.nextLine());
        }
        System.out.println("\n Nomes cadastrados");

        for(int i=0;i<nomes.size();i++){
            System.out.println(i+" - "+nomes.get(i));
        }

        int indiceAlterar;
        do {System.out.println("\n Informe o índice para alterar: ");
        indiceAlterar = sc.nextInt();
        sc.nextLine();
        if (indiceAlterar <0 || indiceAlterar>nomes.size()) {
            System.out.println("Indice inválido");
        }
        } while (indiceAlterar<0 || indiceAlterar>=nomes.size());

        System.out.println("Digite o novo nome: ");
        String novoNome = sc.nextLine();
        
        nomes.set(indiceAlterar, novoNome);
        System.out.println("nome alterado com sucesso!"); //fim alterar
        System.out.println();
        //Remover inicio

        int indice;
        do {
            System.out.println("informe o indice para remover");
            indice=sc.nextInt();
            if (indice <0 || indice>nomes.size()) {
                System.out.println("Indice inválido");
            }
        } while (indice<0 || indice>=nomes.size());
        nomes.remove(indice);
        System.out.println("Nomes removido com sucessso!");

        for(String nome:nomes){
            System.out.println(nome);
        }
        
        sc.close();
    }
}
