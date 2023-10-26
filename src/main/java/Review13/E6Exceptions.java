package Review13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E6Exceptions {
    public static void main(String[] args) {
        try{
        FileInputStream fileInputStream = new FileInputStream("sjndjs");}
        catch (FileNotFoundException f){
            f.printStackTrace();
         // System.out.println(f.getMessage());
         // System.out.println(f);
        }


    }
}
