package Homework;

import java.util.Scanner;

//Create a Java program that will ask if user has a credit card or not. If you user does not have a credit card then
//offer them. If they do have one ask what is balance on the card? If balance of the card is larger than 1000, tell
//them to pay off immediately, otherwise you can tell them that they can spend more.
public class HwCreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String answer=scanner.next();
        if(answer.equals("Yes")){
            System.out.println("What is the balance on your card?");
            Scanner scanner2=new Scanner(System.in);
            int balance=scanner.nextInt();
            if(balance>1000){
                System.out.println("Pay your card off immediately");


            }else{
                System.out.println("You can spend more.");
            }

        }else{
            System.out.println("Would you like a credit card?");
        }



    }
}
