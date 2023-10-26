package replit;

import java.util.LinkedList;

public class Replit_190 {
    public static void main(String[] args) {
        LinkedList<Integer> fib = new LinkedList<>();
        int first = 0;
        int second = 1;
        for (int i = 0; i < 10; i++) {
            fib.add(first);
            int next = first+second;
            first = second;
            second = next;
        }
        fib.forEach(x-> System.out.print(x+" "));


    }
}
