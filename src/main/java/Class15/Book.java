package Class15;

public class Book {
    private String name;
    private int price;

    public Book(String name) {
        this.name = name;
    }
    public Book(String name, int price) {
        this(name);
        this.price = price;
    }

    public void printInfo(){
        System.out.println(name+" "+price);
    }

    public static void main(String[] args) {
        Book b1=new Book("Syntax");
        Book b2=new Book("Technologies",100);
        b1.printInfo();
        b2.printInfo();
    }

}
