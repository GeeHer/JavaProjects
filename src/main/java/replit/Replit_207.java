package replit;
/*Create Hash Map.
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
print keys and values using for each loop
replace with below key THREE--> ASEL and key FIVE-->SUMAIR
print keys and values using for each loop
OUTPUT
HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL*/

import java.util.HashMap;

public class Replit_207 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");

        System.out.println("HashMap Before Replace :");
        map.forEach((x,v)-> System.out.println(x+" : "+v));

        System.out.println("------------------");

        System.out.println("HashMap After Replace :");

        map.replace("THREE","ASEL");
        map.replace("FIVE","SUMAIR");
        map.forEach((x,v)-> System.out.println(x+" : "+v));

    }
}
