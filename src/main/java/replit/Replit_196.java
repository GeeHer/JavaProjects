package replit;

import java.util.HashSet;

/*Create a Set and below values to it.
[third, first, second]
Print HashSet and then remove all the elements from Hashset and print it again.
**Expected Output:**
[third, first, second]
[]*/
public class Replit_196 {

    public static void main(String[] args) {
        HashSet<String> values = new HashSet<>();
        values.add("third");
        values.add("first");
        values.add("second");

        System.out.println(values);
        values.clear();
        System.out.println(values);

    }

}
