package Class11;

public class E8StringMethods {
    public static void main(String[] args) {
       String str="Hi There how are you. I am Good. I am driving";
      // str.split("[.]");
       String[] strs= str.split("[.]");
        System.out.println(strs.length);
        System.out.println(strs[2].trim());

        for(String s:strs){
            System.out.println(s);
        }
    }
}
