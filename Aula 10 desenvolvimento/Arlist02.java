import java.lang.reflect.Array;
import java.util.ArrayList;

public class Arlist02 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(15);
        numeros.add(25);
        numeros.add(555);

        for(int i=0;i<numeros.size();i++){
            System.out.println(numeros.get(i));
            
    
        }
        numeros.set(0, 6990);
        numeros.remove(2);
        System.out.println();
        for(Integer n : numeros){
            
            System.out.println(n);
        }
        
    }

}
