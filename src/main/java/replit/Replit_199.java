package replit;
/*null
Sohil
Diego
Alijon
Asel
Sumair*/

import java.util.LinkedHashSet;

public class Replit_199 {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("null");
        names.add("Sohil");
        names.add("Diego");
        names.add("Alijon");
        names.add("Asel");
        names.add("Sumair");

        for(String n:names ){
            System.out.println(n);
        }
        names.forEach(x-> System.out.println(x));
    }
}
