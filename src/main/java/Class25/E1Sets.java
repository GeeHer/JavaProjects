package Class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E1Sets {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        // We can store duplicates in an ArrayList or LinkedList
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);

        HashSet<Integer> uniqueNumbers=new HashSet<>();
        uniqueNumbers.add(10);
        uniqueNumbers.add(20);
        uniqueNumbers.add(10);
        System.out.println(uniqueNumbers);

    }
}
