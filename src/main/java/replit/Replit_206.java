package replit;
/*Create a Hash Map of String pairs
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
Print key and values pairs using for each loop
Remove below from Map
"ONE"
"FOUR"
after removal print again
**Expected Output:**
HashMap Before Remove :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
HashMap After Remove :
FIVE : EEE
TWO : BBB
THREE : CCC*/

import java.util.HashMap;

public class Replit_206 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");

        System.out.println("HashMap Before Remove :");
        map.forEach((x,v)-> System.out.println(x+" : "+v));

        System.out.println("------------------");

        System.out.println("HashMap After Remove :");
        map.remove("ONE");
        map.remove("FOUR");

        map.forEach((x,v)-> System.out.println(x+" : "+v));

    }
}
