package replit;
/*Create the HashSet with list of Integers add the below numbers for the list
111
111
111
999
999
999
Print elements one by one.
**Expected Output**
111*/

import java.util.HashSet;

public class Replit_195 {

    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(111);
        numbers.add(111);
        numbers.add(111);
        numbers.add(999);
        numbers.add(999);
        numbers.add(999);

      numbers.forEach(x-> System.out.println(x));
    }

}
