package Review11;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Cherry");

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Carrot");
        vegetables.add("Cucumber");
        System.out.println(vegetables);
        vegetables.addAll(fruit);
        System.out.println(vegetables);

        /*fruit.set(2,"Grapes");
        System.out.println(fruit);
        fruit.isEmpty();
        fruit.indexOf("Apple");
        System.out.println(fruit.lastIndexOf("Apple"));*/
        //fruit.clear();
        //fruit.forEach(x-> System.out.println(x));
       /* fruit.forEach(x->{
            if(x.contains("a")){
                System.out.println(x);
            }
        });*/

        }
    }

