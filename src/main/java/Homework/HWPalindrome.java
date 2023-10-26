package Homework;

public class HWPalindrome {
    String palindrome(String word){
        String reverse="";

        for (int i = word.length()-1; i >=0 ; i--) {
            reverse=reverse+word.charAt(i);

        }
        if(word.equals(reverse)){
            return word+" is palindrome.";
        } else return word+" is not palindrome.";
    }
}
