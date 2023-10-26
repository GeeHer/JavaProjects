package Homework;
/*Create a String that will hold a sentence. Write a program to get a new String without any spaces.*/
public class HwStringWithNoSpaces {
    public static void main(String[] args) {
        String str="Write a program to get a new String without any spaces";
        System.out.println(str.replaceAll(" ",""));
    }
}
