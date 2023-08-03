package Class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        // Creating the object of the scanner class so that we can reuse the logic
        // from this class which is already written for us by Java developers
        Scanner input=new Scanner(System.in);
        // Taking an input from the user and storing it in a name variable
        String name=input.next();
        if(name.equals("Guillermo")){
            System.out.println("Java Student.");
        }else System.out.println("I don't know you.");
        // System.out.println("Hello "+name);
    }
}
