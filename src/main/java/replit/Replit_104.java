package replit;

import java.util.Scanner;

public class Replit_104 {
    public static void main(String[] args) {
        String []str = new String [5];


        for (int i = 0; i < str.length; i++) {
            Scanner scanner= new Scanner(System.in);
            String name=scanner.nextLine();
            str[i]=name;
        }
        System.out.println(str);

    }
}
