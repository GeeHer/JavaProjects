package Homework;

public class Bird {
    private String breed;
    private String color;
    private int age;
    private int weight;

    Bird(String breed, String color, int age, int weight){
        this.breed=breed;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }

    public void printInfo(){
        System.out.println(breed+" "+color+" "+age+" "+weight);
    }
}

class Sparrow extends Bird{

    Sparrow(String breed, String color, int age, int weight) {
        super(breed, color, age, weight);
    }
}

class Parrot extends Bird{

    Parrot(String breed, String color, int age, int weight) {
        super(breed, color, age, weight);
    }
}
