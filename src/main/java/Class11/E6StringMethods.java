package Class11;

public class E6StringMethods {
    public static void main(String[] args) {
        String str="ksdnfjAZSX232984!@#%^&AS";
        System.out.println(str.replaceAll("[A-Z]","="));
        System.out.println(str.replaceAll("[a-z]","="));
        System.out.println(str.replaceAll("[0-9]",""));
        System.out.println(str.replaceAll(""," "));
        System.out.println(str.replaceAll("[A-Z0-9]","="));
        System.out.println(str.replaceAll("[A-Z0-58-9a-j]",""));
        System.out.println(str.replaceAll("[ks2S]",""));
        System.out.println(str.replaceAll("[^A-Z]",""));
    }
}
