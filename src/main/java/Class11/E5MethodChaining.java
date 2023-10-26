package Class11;

public class E5MethodChaining {
    public static void main(String[] args) {
        String str="Batch 17 is good";
        String newStr=str.replace("good","great");
        System.out.println(newStr);

        String phrase="Batch 17 IS GREAT";
        System.out.println(str.toLowerCase().trim().replace("great","Good"));
    }
}
