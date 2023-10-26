package Review2;

import java.util.Scanner;

public class E5IfElseStatement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age to calculate the discount.");
        int age=scanner.nextInt();


        if(age>60){
            System.out.println("You get 20% Discount");
        }else if(age>50){
            System.out.println("You get 15% Discount");
        }else if(age>40){
            System.out.println("You get 10% Discount");
        }else{
            System.out.println("No discounts for you. Please try after 10 years");
        }
    }
}
