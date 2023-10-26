package Homework;

import java.util.Scanner;

/*Allow user to enter grade (A, B, or C etc...) and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad,
any other grade --> Not Acceptable. At the end your program should print which grade was entered by a user
with explanation.*/
public class HwExcellent {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a garde (A, B, C, or D)");
        char grade=scanner.next().charAt(0);

        switch(grade){
            case 'A':
                System.out.println(grade +"-Excellent");
                break;
            case 'B':
                System.out.println(grade+"-Good");
                break;
            case 'C':
                System.out.println(grade+"-Average");
                break;
            case 'D':
                System.out.println(grade+"-Bad");
                break;
            default:
                System.out.println("Not Acceptable");

        }




    }
}
