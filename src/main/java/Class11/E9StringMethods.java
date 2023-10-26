package Class11;

public class E9StringMethods {
    public static void main(String[] args) {
       String str="Hi#There#how#are#you";
       String [] strArr=str.split("[#]");
        System.out.println(strArr.length);
        System.out.println(strArr[1]);

    }
}
