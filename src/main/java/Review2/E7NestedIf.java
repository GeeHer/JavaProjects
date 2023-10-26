package Review2;

public class E7NestedIf {
    public static void main(String[] args) {
        String day = "Sunday";
        double accountBalance = 5000;
        // ==equals()  != !equals()
        if (day.equals("Sunday")) {
            if (accountBalance > 2000) {
                System.out.println("We can buy this.");
            } else {
                System.out.println("It's too expensive.");
            }

        } else if (day.equals("Saturday")) {
            System.out.println("It's Saturday, lets go for dinner");
        } else {
            System.out.println("Lets wait for Sunday.");
        }
    }
}
