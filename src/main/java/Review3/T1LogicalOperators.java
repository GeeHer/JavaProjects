package Review3;
/*Ask the user to input two boolean values (true or false).
Use the logical AND operator (&&) to determine if both are true.
Display the result to the user.*/

import java.util.Scanner;

public class T1LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input two boolean values");
        boolean answer=scanner.nextBoolean();
        boolean answer2=scanner.nextBoolean();

        if(answer&&answer2){

        System.out.println("Both values are true");
        } else{
            System.out.println("Both values are not true");
        }

    }
}
