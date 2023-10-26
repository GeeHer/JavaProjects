package Homework;

import java.util.Scanner;
//You are DMV representative and you need to ask customer their age. If they are 18 and older you will issue
// a driver license to them, otherwise you will offer them to get a learners permit.

public class HwDMVRepresentative {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your age?");

        int age=scanner.nextInt();

        if(age>=18){
            System.out.println("Issue a drivers license.");
        } else {
            System.out.println("Offer learners permit.");
        }
    }
}
