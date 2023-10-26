package Class6;

import java.util.Scanner;

public class E8While {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input;

        System.out.println("Please enter a number or -1 to terminate");
        input=scanner.nextInt();
        System.out.println("You have entered "+input);
        while (input != -1) {
            System.out.println("Please enter a number or -1 to terminate");
            input = scanner.nextInt();
            System.out.println("You have entered " + input);
        }
    }
}
