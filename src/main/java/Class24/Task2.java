package Class24;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> cars= new ArrayList<>();
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Mercedez");
        cars.add("BMW");
        cars.add("Nissan");

        System.out.println(cars);
        for(String c:cars){
            System.out.println(c);
        }
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        ArrayList<String> drinks= new ArrayList<>();
        drinks.add("Pepsi");
        drinks.add("Coke");
        drinks.add("Mountain Dew");
        drinks.add("Dr Pepper");
        drinks.add("Red Bull");

        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("e") || drinks.get(i).contains("a")){
                drinks.set(i,"Water");
            }
        }
        System.out.println(drinks);

    }
}
