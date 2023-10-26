package Class20;

public class Student {

    public void eat(){
        System.out.println("Students eat");
    }
    public void sleep(){
        System.out.println("Students sleep");
    }
    public void study(){
        System.out.println("Students study");
    }
}

class SyntaxStudents extends Student{
    @Override
    public void eat() {
        System.out.println("Students eat breakfast before class");
    }
}

class CollegeStudents extends Student{
    @Override
    public void study() {
        System.out.println("Student studies after class");
    }
}

class SchoolStudent extends Student{
    @Override
    public void sleep() {
        System.out.println("Student sleeps after a long day of studies.");
    }
}

class StudentTester{
    public static void main(String[] args) {
        Student [] arr={new SyntaxStudents(),new CollegeStudents(),new SchoolStudent() };

        for(Student s:arr){
            s.eat();
            s.sleep();
            s.study();
        }
    }
}
