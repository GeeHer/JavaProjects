package replit;

public class Replit_117 {
    public static void main(String[] args) {
        System.out.println(sumEvenToX(10));
    }

    static int sumEvenToX(int x) {
        int sum = 0;
        for (int i = 2; i <= x; i += 2) {
            sum = sum + i;

        }
        return sum;
    }
}
