package Homework;
/*Print numbers from 1 to 100 in 1 line with space
Print numbers from 100 to 1
Print even numbers from 20 to 1 (using 2 different loops)
Print odd numbers between 20 and 50 (using 2 different loops)*/

public class HwWhileLoop {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 100) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        int num2 = 100;
        while (num2 >= 1) {
            System.out.print(num2 + " ");
            num2--;
        }
        System.out.println();
        int num3 = 20;
        while (num3 >= 1) {
            System.out.print(num3 + " ");
            num3 -= 2;
        }
        System.out.println();
        for (int i = 20; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        int num4 = 21;
        while (num4 <= 50) {
            System.out.print(num4 + " ");
            num4 += 2;
        }
        System.out.println();
        for (int i2 = 21; i2 <= 50; i2 += 2)
            System.out.print(i2 + " ");


    }
}
