package replit;

/*For you to do:
Create an instance final method that will reverse a String and return that new String
Call method from the main method
**Expected Output:**
```
olleh
```*/

public class Replit_168 {
    public static void main(String[] args) {

        Replit_168 obj= new Replit_168();
        obj.reverse("hello");


    }

    final void reverse(String str){
        for (int i = str.length()-1; i >= 0; i--) {
            String reverseStr="";
            reverseStr=reverseStr+str.charAt(i);
            System.out.print(reverseStr);

        }
    }
}
