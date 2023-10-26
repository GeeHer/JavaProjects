package Homework;
/*How would you check if String is palindrome or not? aba=> true
Abbc =>false*/
public class HwStringPalindrome {
    public static void main(String[] args) {
        String str="abrrba";
        String reverse="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse=reverse+str.charAt(i);
        }
        if (str.equals(reverse)){
            System.out.println("It's a palindrome");
        } else{
            System.out.println("It's not a palindrome");
        }
    }
}
