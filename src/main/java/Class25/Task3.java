package Class25;

import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("USA");
        countries.add("Brazil");
        countries.add("France");
        countries.add("Italy");
        countries.add("Spain");
        countries.add("Mexico");
        countries.add("El Salvador");
        countries.add("Argentina");
        countries.add("Chile");
        countries.add("Guatemala");

       countries.forEach(x-> System.out.println(x));
        System.out.println();
       for(String c:countries){
           System.out.println(c);
       }
    }
}
