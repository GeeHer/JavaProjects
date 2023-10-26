package Class5;

import java.util.Scanner;

public class T5Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your country.");
        String country = scanner.nextLine();

        switch (country) {
            case "USA":
                System.out.println("English");
                break;
            case "El Salvador":
                System.out.println("Spanish");
                break;
            case "Italy":
                System.out.println("Italian");
                break;
            case "Portugal":
                System.out.println("Portuguese");
                break;
            case "France":
                System.out.println("French");
                break;
            default:
                System.out.println("Invalid");


        }
    }
}
