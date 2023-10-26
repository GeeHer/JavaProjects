package Homework;

import java.util.ArrayList;

public class IntegersSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(19);
        numbers.add(82);
        numbers.add(37);
        numbers.add(29);
        numbers.add(63);
        numbers.add(1);

        int sum=0;
        for(Integer n:numbers){
            sum+=n;
        }
        System.out.println(sum);

    }
}

