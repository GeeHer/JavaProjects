package replit;

import java.util.Scanner;

public class Replit_099 {



        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String givenString = inp.nextLine();
            //write your code below
            System.out.println(testPalindrome(givenString));

        }
        public static boolean testPalindrome(String input){
            boolean flag = false;
            String expected="";
            for(int i =input.length()-1;i>=0;i--){
                expected +=input.charAt(i);
            }
            System.out.println(expected);
            if(expected.equals(input)){
                flag=true;
            }
            return flag;
        }

    }


