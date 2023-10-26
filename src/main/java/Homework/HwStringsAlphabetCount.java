package Homework;
/*
Create a String that should be combination of letters, numbers and special characters.
Find out how many Alphabets(abd AZ) characters are there in the String.
 */


public class HwStringsAlphabetCount {
    public static void main(String[] args) {

        String str = "AGSH76899NHb*&(bygv";
        char [] charArray=str.toCharArray();
        int alphabet = 0;


        for (char c:str.toCharArray()) {
            if(Character.isAlphabetic(c)){
            alphabet++;
            }
        }
        System.out.println(alphabet);


    }

}
