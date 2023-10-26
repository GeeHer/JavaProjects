package Class6;

import java.util.Scanner;

public class T9WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the starting point");
        int start=scanner.nextInt();
        System.out.println("Please enter the ending point");
        int end=scanner.nextInt();
        System.out.println("Please enter the steps as well");
        int step=scanner.nextInt();

        while (end>=start){
            System.out.print(start+" ");
            start+=step;
        }
    }
}
