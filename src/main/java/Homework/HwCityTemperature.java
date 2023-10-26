package Homework;

import java.util.Scanner;
//Create a Java program that will ask user to input city and temperature. Your program
// should convert Fahrenheit into Celsius and print “The temperature is the city  is ”

public class HwCityTemperature {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your city?");
        String city=scanner.nextLine();
        System.out.println("What is the temperature?");
        double temperature=scanner.nextDouble();
        double convert=(temperature-32)*5/9;

        System.out.println("The temperature in "+city+" is "+convert);



    }



}
