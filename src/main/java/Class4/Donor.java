package Class4;

public class Donor {
    public static void main(String[] args) {
        int age = 10;
        int weight = 120;

        if(age>18){
            if(weight>110){
                System.out.println("You are eligible to donate blood.");
            }else{
                System.out.println("You are not eligible to donate blood.");
            }
        } else{
            System.out.println("Age must be greater than 18.");
        }
    }
}

