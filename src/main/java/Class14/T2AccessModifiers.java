package Class14;

public class T2AccessModifiers {
    public static String reverse(String str){
        String rvrs="";
        for (int i = str.length()-1; i >=0 ; i--) {
            rvrs=rvrs+str.charAt(i);

        }
        return rvrs;
    }

    public static void main(String[] args) {
        T2AccessModifiers.reverse("Hello");
        System.out.println(reverse("Hello"));
    }
    }


