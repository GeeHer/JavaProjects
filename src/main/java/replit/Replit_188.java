package replit;
/*Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line
        Numbers in:
        4
        62
        8
        5
        4
        ```*/

import java.util.ArrayList;
import java.util.Scanner;

public class Replit_188 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> i = new ArrayList<>();
        i.add(s.nextInt());
        i.add(s.nextInt());
        i.add(s.nextInt());
        i.add(s.nextInt());
        i.add(s.nextInt());


        i.forEach(x-> System.out.print(x+" "));
    }
}
