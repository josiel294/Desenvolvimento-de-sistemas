import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[]nomes =new String[3];

        for (int i=0;i<nomes.length;i++){
            System.out.println("Informe o "+i+"º nome");
            nomes[i]=sc.nextLine();
        }

        for (int i=0; i<nomes.length;i++){
            System.out.println("Nomes cadastrados são: "+nomes[i]);
        }

        for (String n : nomes) {
            System.out.println(n);
        }

        sc.close();
    }
}
