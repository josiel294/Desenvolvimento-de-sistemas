import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArList01 {

    public static void main(String[] args) {
        // Criando Arraylist

        ArrayList<String> nomes = new ArrayList<>();

        // Adicionar
        nomes.add("Josiel");
        nomes.add("Kaio");
        nomes.add("Sones");
        // listando
        for(int i=0; i<nomes.size();i++){
            System.out.println(nomes.get(i));
        
            // Alterar
            nomes.set(1, "Brandão");

            // remover
            nomes.remove("Sones");

            for (String nome:nomes){
                System.out.println(nome);
            }
        
        }
        System.out.println("os nomes cadastrados são: "+nomes);
    }
}