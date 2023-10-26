package Class16;

public class ConTester {

    private ConTester(){
        System.out.println("Private");
    }

    ConTester(String name){
        System.out.println("Default");
    }
    protected ConTester(int age){
        System.out.println("Protected");
    }
    public ConTester(double weight){
        System.out.println("Public");
    }

    public static void main(String[] args) {
        new ConTester();
        new ConTester("jgdk");
        new ConTester(12);
        new ConTester(56.95);
    }
}
