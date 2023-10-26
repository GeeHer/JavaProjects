package replit;

import java.util.ArrayList;

public class Replit_193 {
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<>();
        i.add(111);
        i.add(222);
        i.add(333);
        i.add(444);
        i.add(555);
        i.add(666);

        int sum=0;
        for(Integer n:i){
            sum=n+sum;
        }
        System.out.println("The result of sum is "+sum);
    }
}
