package Class8;

public class E6BreakKeyword {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println("Outer Loop");
            for (int j = 0; j < 5; j++) {
                if(j==2){
                    break;
                }
                System.out.println("Inner Loop");
            }

        }
    }
}
