package Class11;

public class E2StringMethods {
    public static void main(String[] args) {
        String str="Batch 17 is A great batch. Just kidding. Please don't take it seriously";
        int total=0;

        for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i)=='a'|| str.charAt(i)=='A'){
               total++;

           }

        }
        System.out.println(total);
    }
}
