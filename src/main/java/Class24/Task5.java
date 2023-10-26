package Class24;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> fruit= new ArrayList<>();
        fruit.add("apple");
        fruit.add("pear");
        fruit.add("strawberry");
        fruit.add("mango");
        fruit.add("kiwi");

        fruit.removeIf(x-> x.contains("a") || x.endsWith("e"));
        System.out.println(fruit);

    }
}
