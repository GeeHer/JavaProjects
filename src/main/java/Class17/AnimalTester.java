package Class17;

public class AnimalTester {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.name="Tom";
        cat.breed="Russian";
        cat.color="White";
        cat.age=8;
        cat.attitude=true;
        cat.printInfo();

        Dog dog=new Dog();
        dog.bark();
        dog.name="Jacky";
        dog.breed="German";
        dog.printInfo();

    }
}
