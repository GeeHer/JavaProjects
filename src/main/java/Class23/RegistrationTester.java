package Class23;

public class RegistrationTester {
    public static void main(String[] args) {


        Registration r=new Registration("salih3298@yahoo.com", "salih3298", "7125318");
        System.out.println(r.getEmail());
        System.out.println(r.getPassword());
        System.out.println(r.getUserName());
    }
}
