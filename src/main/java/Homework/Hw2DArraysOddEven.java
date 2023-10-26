package Homework;
/*Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
Develop a program which will identify/print the even numbers only.*/

public class Hw2DArraysOddEven {
    public static void main(String[] args) {
        int [][] num={{12,45,26,5},{3,86,36,9},{7,2,6,1}};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if(num[i][j]%2 !=0){
                    System.out.println(num[i][j]);
                }

            }

        }

    }
}
