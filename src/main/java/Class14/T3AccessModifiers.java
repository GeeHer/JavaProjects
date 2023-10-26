package Class14;

public class T3AccessModifiers {
    private static String getVowels(String str){
       return str=str.replaceAll("[^aeiouAEIOU]","");
}

    public static void main(String[] args) {
        System.out.println(getVowels("VerbolBadBoy"));
    }
}
