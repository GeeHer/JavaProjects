package Class16;

public class Cat {
    private String breed;
    private int age;
    private String hairColor;
    private double weight;

    Cat(){}
    Cat(String breed, int age, String hairColor){
        this.breed=breed;
        this.age=age;
        this.hairColor=hairColor;
    }

    Cat(String breed,int age, String hairColor,double weight) {
        this(breed, age, hairColor);
        this.weight = weight;

    }

    public void printInfo(){
        System.out.println(breed+" "+age+" "+hairColor+" "+weight);
    }
}




