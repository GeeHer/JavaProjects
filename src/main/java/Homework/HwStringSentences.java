package Homework;
/*You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
 How would you find out how many sentences are in that String?*/
public class HwStringSentences {
    public static void main(String[] args) {
        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        String [] b=(a.split("\\?"));
        int number=b.length;
        System.out.println(number);
    }
}
