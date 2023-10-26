package Homework;
/*Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students*/

public class StudentsTester {
    static int numberOfStudents;

    public static void main(String[] args) {
        Students obj= new Students();
        obj.name="Wendy";
        obj.ID="TG736";
        numberOfStudents ++;

        Students obj2= new Students();
        obj2.name="Guillermo";
        obj2.ID="GT7263";
        numberOfStudents ++;

        Students obj3= new Students();
        obj3.name="Kiki";
        obj3.ID="CT88s82";
        numberOfStudents ++;

        System.out.println("Total number of students: "+numberOfStudents);

    }
}
