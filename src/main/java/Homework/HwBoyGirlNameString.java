package Homework;
/*Write a program that reads two people's first names and if they are expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY*/

import java.util.Scanner;

public class HwBoyGirlNameString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter mom's first name");
        String momName=scanner.nextLine();
        System.out.println("Enter dad's first name");
        String dadName=scanner.nextLine();
        System.out.println("Enter the baby's gender (Boy/Girl)");
        String babyGender=scanner.nextLine();

        if(babyGender.equalsIgnoreCase("boy")){
            String boysName=dadName.substring(0,dadName.length()/2) + momName.substring(0,momName.length()/2);
            System.out.println(boysName);
        }else if(babyGender.equalsIgnoreCase("girl")){
            String girlName=momName.substring(0,momName.length()/2)+dadName.substring(0,dadName.length()/2);
            System.out.println(girlName);
        }else System.out.println("Invalid gender");
    }
}
