package Class5;

public class E2NotOperator {
    public static void main(String[] args) {
        String country = "UK";
        /*
        write a program that checks if the country is not equal to Iran
        it says you are allowed.
        */

        if (!country.equals("Iran")) {
            System.out.println("Welcome, you are allowed.");
        } else {
            System.out.println("You are not allowed.");
        }

    }
}
