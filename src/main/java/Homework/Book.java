package Homework;

public class Book {
    private String name;
    private int pages;
    private String genre;
    private int cost;

    public Book(String name, int pages, String genre){
        this.name=name;
        this.pages=pages;
        this.genre=genre;
    }

    public Book(String name, int pages, String genre, int cost){
        this(name, pages, genre);
        this.cost=cost;
    }

    public void printInfo(){
        System.out.println(name+" "+pages+" "+genre+" "+cost);
    }


}
