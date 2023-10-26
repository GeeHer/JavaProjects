package Class26;

import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        TreeMap<String,String> countries = new TreeMap<>();
        countries.put("Argentina","Buenos Aires");
        countries.put("Austria","Vienna");
        countries.put("Brazil","Brasilia");
        countries.put("Canada","Ottawa");
        countries.put("Colombia","Bogota");
        countries.forEach((k,v)-> System.out.println(k+" "+v));
        countries.forEach((k,v)-> System.out.println(v));

    }
}
