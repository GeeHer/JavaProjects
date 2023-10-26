package Class5;
/* Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season __”.
 */

import java.util.Scanner;

public class T1OROperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your birth month.");
        String month=scanner.nextLine();

        if(month.equals("March")||month.equals("April")||month.equals("May")){
        System.out.println("You were born in Spring.");
        }else if (month.equals("June")||month.equals("July")||month.equals("August")){
            System.out.println("You were born in Summer.");
        }else if (month.equals("September")||month.equals("October")||month.equals("November")){
            System.out.println("You were born in Fall.");
        }else{
            System.out.println("You were born in Winter.");
        }

    }
}
