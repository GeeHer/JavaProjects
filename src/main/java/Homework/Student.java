package Homework;
/*Create a Set that will hold Objects of Student Type. In this set we do not care about the insertion order.
Each student object should have name and studentID. Display name of each student.*/

import java.util.HashSet;

public class Student {
    private String studentName;
    private int studentID;

    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public String getStudentName(){
        return studentName;
    }

    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
       students.add(new Student("Guillermo",1234));
       students.add(new Student("Wendy",1723));
       students.add(new Student("Magic",8263));
       students.add(new Student("Kiki",7354));
       for(Student s:students){
           System.out.println(s.getStudentName());
       }

    }
}
