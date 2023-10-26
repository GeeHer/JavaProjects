package Homework;

import java.util.TreeSet;

/*Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.*/
public class ObjectOfString {
    public static void main(String[] args) {
        TreeSet<String> objects= new TreeSet<>();
        objects.add("cookies");
        objects.add("Guillermo");
        objects.add("clothes");
        objects.add("glass");
        objects.add("coffee");
        objects.forEach(x-> System.out.println(x));
    }
}
