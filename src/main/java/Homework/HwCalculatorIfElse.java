package Homework;
/*Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator
provide the result to user. Please complete this assignment in 2 ways: using if statement and switch case.*/

import java.util.Scanner;

public class HwCalculatorIfElse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your first number.");
        int num1=scanner.nextInt();
        System.out.println("Please enter your second number.");
        int num2=scanner.nextInt();
        System.out.println("Please enter your operator");
        char operator=scanner.next().charAt(0);

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        }
    }
}
