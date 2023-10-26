package Class17;

public class E {
    static String name="Guillermo";
    static void printF(){
        System.out.println("f");
    }
}
 class F extends E {
     public static void main(String[] args) {
         printF();
         System.out.println(name);
     }
 }