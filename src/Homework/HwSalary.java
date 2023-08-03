//Write a program to ask user to enter numbers of worked years and annual salary. If user worked for more or equals
//to 5 years than user is eligible for the bonus, otherwise he is not. Once user is eligible and salary is larger
//than 50000 than bonus = 5000, otherwise bonus=3000.
package Homework;

import java.util.Scanner;

public class HwSalary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many years have you worked?");
        int years=scanner.nextInt();
        if(years>=5) {
            System.out.println("You are eligible for a bonus!");
            Scanner scanner2=new Scanner(System.in);
            System.out.println("What is your salary?");
            int salary=scanner.nextInt();
            if(salary>50000){
                System.out.println("Congratulations, your bonus is $5,000. ");
            } else{
                System.out.println("Congratulations, your bonus is $3,000.");
            }

        } else {
            System.out.println("You are not eligible for a bonus.");
        }

    }
}
