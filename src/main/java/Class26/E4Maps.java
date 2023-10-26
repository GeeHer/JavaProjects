package Class26;

import java.util.TreeMap;

public class E4Maps {public static void main(String[] args) {
    TreeMap<String,Double> makeup = new TreeMap<>();
    makeup.put("Lipstick",22.0);
    makeup.put("BlushOn",40.0);
    makeup.put("Base",50.5);
    makeup.put("Foundation",90.5);
    makeup.put("Concealer",35.5);
    makeup.put("EyeLiner",25.5);
    makeup.forEach((key,value)-> System.out.println(key+" "+value));
    makeup.forEach((k,v)-> System.out.println(k));
    makeup.forEach((k,v)-> System.out.println(v));
    makeup.forEach((k,v)->{
        if(k.contains("a")){
            System.out.println(v);
        }
    });
}
}
