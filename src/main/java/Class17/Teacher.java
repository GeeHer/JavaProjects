package Class17;

public class Teacher {
    char gender;
    String name;
    int age;

    void printGender(){
        System.out.println(gender);
    }
    void printName(){
        System.out.println(name);
    }
    void printAge(){
        System.out.println(age);
    }
    void printInfo(){
        System.out.println(gender+" "+name+" "+age+" ");
    }

}
class MathTeacher extends Teacher{

    }
