package Homework;
/*How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever*/

public class HwReverseString {
    public static void main(String[] args) {
        String str="This is the sentence I want to reverse";
        String [] arr=str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String word=arr[i];
            String reversed=reverseStr(word);
            System.out.print(reversed+" ");
        }

        System.out.println(reverseStr("This is the sentence I want to reverse"));
        }
        static String reverseStr(String inputStr){
        String reversed="";
        for(int i= inputStr.length()-1; i>=0; i--){
            reversed=reversed+inputStr.charAt(i);
        }
        return reversed;
        }
    }

