package replit;
/*Create an ArrayList of type boolean called listA and add below values
(true, false, false)
Create another array list call listB and ad all values from List A into it
Print all values from ListB 1 by 1 using loop
**Expected Output:**
true
false
false*/

import java.util.ArrayList;

public class Replit_191 {
    public static void main(String[] args) {
        ArrayList<Boolean> listA = new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);

        ArrayList<Boolean> listB = new ArrayList<>();
        listB.addAll(listA);

        listB.forEach(x-> System.out.println(x));


    }
}
