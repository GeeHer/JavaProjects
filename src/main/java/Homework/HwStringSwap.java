package Homework;
/*How would you swap  2 strings without a temporary variable?*/
public class HwStringSwap {
    public static void main(String[] args) {
        String str1="Syntax";
        String str2="Technologies";

        System.out.println("Before swapping = ");
        System.out.println("First string is: "+str1);
        System.out.println("Second string is: "+str2);
        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println("After swapping =");
        System.out.println("First string is: " +str1);
        System.out.println("Second string is: "+str2);


    }
}
