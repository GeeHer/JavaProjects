package replit;

public class replit_130 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        mystery(a);
        // should print out 10 1 30 2 50
    }

    static void mystery(int[] a)	{
        for (int i = 0; i < a.length; i++) {
            if(a[i] %2==0){
                System.out.println(a[i]/2);
            }
            if(a[i]%2 !=0){
                System.out.println(a[i]*10);
            }
        }

    }
}

