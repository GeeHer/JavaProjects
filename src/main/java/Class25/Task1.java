package Class25;
/*Create a Cat class create 3 fields a constructor and printInfo method inside it. Create three objects from this
class store them inside the Linkedlist and call printInfo method using these three objects.*/

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Cat> cats = new LinkedList<>();
        cats.add(new Cat("Kiki","Orange",13));
        cats.add(new Cat("Magic","Grey",4));
        cats.add(new Cat("Kitty","Black",5));

        cats.forEach(x-> x.printInfo());

    }
}

class Cat{
    String name;
    String color;
    int age;

    public Cat(String name,String color, int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
}
