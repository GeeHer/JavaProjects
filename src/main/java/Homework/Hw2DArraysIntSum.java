package Homework;
/*Create a 2D array of integer type and store numbers in 3 rows and 3 columns.
Print the sum of all numbers.*/

public class Hw2DArraysIntSum {
    public static void main(String[] args) {
        int [][] num={{12,46,26},{4,86,36},{2,6,1}};
        int sum=0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sum=sum+num[i][j];
            }

        }
        System.out.println(sum);
    }
}
