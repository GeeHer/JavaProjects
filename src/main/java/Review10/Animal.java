package Review10;

// Polymorphism: Inheritance, Overloading, Overriding

public class Animal {
    void speak(){
        System.out.println("Animal Speak");
    }

    void eat(){
        System.out.println("Animals Eat");
    }
}

class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Wuff Wuff");
    }

    @Override
    void eat() {
        System.out.println("Dogs like to eat bones");
    }
}

class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Meow Meow");
    }

    @Override
    void eat() {
        System.out.println("Cats like to eat free fish from Guila");
    }
}
