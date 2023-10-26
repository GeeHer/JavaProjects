package Class12;

import java.util.Scanner;

public class E2Methods {
    public static void main(String[] args) {
       takeUserInput();
        System.out.println("Please enter the details again");
        takeUserInput();
        }

    static void takeUserInput(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scanner.nextLine();
        System.out.println("Please enter your age");
        int age=scanner.nextInt();
        System.out.println("Your name is "+name+" and you are "+age+" years old");
    }
}
