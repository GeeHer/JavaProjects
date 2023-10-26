package Homework;
/*Write a method to return whether given number is prime or not?*/

public class HwPrimeNumber {
    String primeNumber(int num){
        if (num <= 1){
            return num + " is not a prime number";
        }
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if(num % 1==0){
                return num +" is not a prime number";
            }

        }
        return num +" is a prime number";
    }
}

