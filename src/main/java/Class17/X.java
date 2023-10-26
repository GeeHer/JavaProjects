package Class17;

public class X {
    String name;
    void printName(){
        System.out.println(name);
    }
}

class Y extends X {
    String lastName;
    void printAge(){
        System.out.println(lastName);
    }
}

class Z extends Y {
    void printInfo(){
        System.out.println(name + " "+ lastName);
    }
}
