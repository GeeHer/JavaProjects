package Class5;

import java.util.Scanner;

public class T4ANDOperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number.");
        int num=scanner.nextInt();

        if(num>=1 && num<=10){
            System.out.println("Small Number");
        }else if(num>=11 && num<=100){
            System.out.println("Medium Number");
        }else if(num>=101 && num<=1000){
            System.out.println("Large Number");
        }

    }
}
