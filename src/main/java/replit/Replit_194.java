package replit;
/*Create a method that takes a list as a parameter removes an element if it starts with letter A from given List and
return new List then in the main method print that list.
**Expected Output:**
[USA, Kazakhstan, Pakistan, Russia]*/

import java.util.LinkedList;

public class Replit_194 {


    public void startsWithA(LinkedList countries){
        for (int i = 0; i < countries.size(); i++) {
            String country = "";
            country = country + countries.get(i);

            if(country.startsWith("A")){
                countries.remove(i);
                --i;
            }
        }
        System.out.println(countries);
    }

    public static void main(String[] args) {



        LinkedList<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

    }



}
