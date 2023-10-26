package Class10;

public class DogTester {
    public static void main(String[] args) {
        // Creating an object from the Dog class
        Dog lunaObj=new Dog();
        // Assigning a value to name using lunaObj
        lunaObj.name="Luna";
        lunaObj.gender='F';
        lunaObj.breed="Shiba";
        lunaObj.weight=10;
        lunaObj.age=25;
        System.out.println(lunaObj.name);
        System.out.println(lunaObj.age);
        System.out.println(lunaObj.breed);

        // We are calling the bark method on lunaObj
        lunaObj.bark();
        lunaObj.eat();
        lunaObj.sleep();

    }
}
