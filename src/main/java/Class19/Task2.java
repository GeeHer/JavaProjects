package Class19;

public class Task2 {
    public static void printInfo(){
        System.out.println("This field is empty.");
    }
    public static void printInfo(String country){
        System.out.println("I live in "+country);
    }

    public static void printInfo(int age, String gender){
        System.out.println("I am a "+age+" year old "+gender);
    }

    public static void main(String[] args) {
        printInfo();
        printInfo("USA");
        printInfo(30,"male");
    }
}

