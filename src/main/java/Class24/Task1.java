package Class24;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.add("Kiki");
        names.add("Magic");
        names.add("Wendy");
        names.add("Miguel");
        names.add("Mike");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Mike"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
