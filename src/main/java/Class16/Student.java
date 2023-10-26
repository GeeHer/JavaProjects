package Class16;

public class Student {
    String name;
    String address;

    public Student(String name, String address){
        this.name=name;
        this.address=address;
    }

    public void displayInfo(){
        System.out.println(name+" "+address);
    }
}

class StudentTester{
    public static void main(String[] args) {
        Student s1=new Student("Guillermo", "USA");
        s1.displayInfo();

    }
}
