package Review11;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        int [] numbers = new int[10];
        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("James");
        names.add("Rai");
        names.add("Aya");
        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.remove(1));
        System.out.println(names.remove("Jamel"));

    }
}
