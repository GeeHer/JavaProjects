package Class25;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Task2 {
    public static void main(String[] args) {


    ArrayList<String> list = new ArrayList<>();
    list.add("John");
    list.add("Jane");
    list.add("James");
    list.add("Jasmine");
    list.add("Jane");
    list.add("James");
        System.out.println(list);

        LinkedHashSet<String> newList = new LinkedHashSet<>(list);
        System.out.println(newList);
        list.clear();
        list.addAll(newList);
        System.out.println(list);


    }
}
