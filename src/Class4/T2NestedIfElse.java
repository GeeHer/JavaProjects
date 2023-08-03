package Class4;

public class T2NestedIfElse {
    public static void main(String[] args) {
        double rate = 4.1;
        int price = 40000;

        if(rate>4.5){
            System.out.println("User will not buy a house.");
        }else{
            System.out.println("User will consider buying a house.");
            if(price>50000){
                System.out.println("User will take a loan.");
            }else{
                System.out.println("User will pay cash.");
            }
        }


    }
}

