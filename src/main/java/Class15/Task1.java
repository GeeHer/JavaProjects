package Class15;

public class Task1 {
    private String name;
    Task1(String tName){
        name=tName;
        System.out.println("Executed constructor with "+name);
    }

    Task1(){
        System.out.println("Executed constructor with no parameters");
    }
}
