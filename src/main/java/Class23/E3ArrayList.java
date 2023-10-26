package Class23;

import java.util.ArrayList;
import java.util.Scanner;

public class E3ArrayList {
    public static void main(String[] args) {

        ArrayList arr=new ArrayList();
        arr.add("Ehab");
        arr.add(12);
        arr.add(new Scanner(System.in));

        checkPrint(arr);
    }

    static void checkPrint(ArrayList aa){
        for(Object d:aa){
            String str=(String)d;
            System.out.println(str.length());

        }
    }
}
