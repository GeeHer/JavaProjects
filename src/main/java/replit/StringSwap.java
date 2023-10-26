package replit;

public class StringSwap {
    public static void main(String[] args) {
        String str1="Shawn";
        String str2="Pease";
        str1=str1+str2; // ShawnPease
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(0,str1.length()-str2.length());
        System.out.println(str2);
        System.out.println(str1);
    }
}
