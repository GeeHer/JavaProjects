package Class26;

import java.util.LinkedHashMap;

public class Task1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> building = new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Google");
        building.put(3,"Amazon");
        building.put(4,"Carbon60");
        building.put(5,"SAP");
        building.put(7,"Syntax");
        System.out.println(building.size());
        building.replace(4,"Apple");
        building.remove(7);
        System.out.println(building);

    }
}
