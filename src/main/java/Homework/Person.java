package Homework;
/*Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object.
Print each object details.
Example of key is 1 , 2 ,3 etc.*/

import java.util.TreeMap;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private double salary;
    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public void printUserDetail(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
    public static void main(String[] args) {
        TreeMap<Integer,Person> person = new TreeMap<>();
        person.put(1,new Person("Wendy","Gue",29,100000));
        person.put(2,new Person("Magic","Herr",10,20000));
        person.put(3,new Person("Kiki","Catty",13,50000));
        person.put(4,new Person("Harold","Techi",35,95000));
        person.forEach((k,v)-> {System.out.println("ID: "+k); v.printUserDetail();});


        }
    }

