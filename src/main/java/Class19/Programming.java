package Class19;

public class Programming {
    public Programming(){
        System.out.println("I love programming languages");
    }

    public Programming(String str){
        System.out.println("I love "+str);
    }
}

class ProgrammingTester{
    public static void main(String[] args) {

        new Programming();
        new Programming("Java");

}
}
