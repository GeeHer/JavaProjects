package Review3;

import java.util.Scanner;

public class E4Switch {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the name of the Fruit");
        String fruit=scanner.nextLine();

        switch(fruit){
            case "Orange":
                System.out.println("It is usually orange");
                break;
            case "Banana":
                System.out.println("Yellow bananas are good");
                break;
            case "Strawberry":
                System.out.println("I like red strawberries");
                break;
            case "Blue Berry":
                System.out.println("Blue berries are very good for your heart");
                break;
            default:
                System.out.println("I dont like this fruit");
        }
    }
}
