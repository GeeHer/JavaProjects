package Class5;

import java.util.Scanner;

public class T2ANDOperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your height in inches."); //Prompt the user input
        double height=scanner.nextDouble(); //To enter person height in inches
        if(height>72){
            System.out.println("Tall");
        }else if(height>=60 && height<=72){
            System.out.println("Medium");
        }else{
            System.out.println("Short");
        }

    }
}
