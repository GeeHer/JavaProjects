package Class11;

public class E1StringMethods {
    public static void main(String[] args) {
        String str = "Batch 17 is great.";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(4));
        int length=str.length();
        System.out.println(length);


        System.out.println(str.charAt(str.length()-1));
        int lastIndex=str.length()-1;
        char c=str.charAt(lastIndex);
        System.out.println(c);
    }

}
