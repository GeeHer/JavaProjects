package replit;

import java.util.ArrayList;

public class Replit_187 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("hi");
        str.add("yo");
        str.add("sup");
        str.add("yolo");
        str.add("boop");

        str.removeIf(x-> x.contains("hi")|| x.contains("sup")||x.contains("boop"));

        str.forEach(x-> System.out.print(x+" "));


    }
}
