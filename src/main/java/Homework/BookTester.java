package Homework;

public class BookTester {
    public static void main(String[] args) {
       Book b1=new Book("Power of Habits",412,"Self Help");
        Book b2=new Book("The Four Agreements",160,"Self Help",20);

        b1.printInfo();
        b2.printInfo();
    }
}
