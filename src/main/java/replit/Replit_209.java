package replit;
/*
Create a Method in Main class using below specification.
Method Name: removeValues.
Return Type: Map<String,Integer>
Parameters : Map<String,Integer>
Logic:
Method should check the values if a value is greater than
15 it should be removed from the map.
**NOW IN MAIN METHOD**
Create HashMap of String keys and Integer values
add values as below
map.put("mango", 10);
map.put("apple", 30);
map.put("orange", 20);
call above method with these arguments.
*/

import java.util.HashMap;
import java.util.Map;

public class Replit_209 {
    public Map<String,Integer> removeValues(Map<String,Integer> d){
        d.entrySet().removeIf(x -> x.getValue() > 15);
        return d;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> maps = new HashMap<>();
        maps.put("mango",10);
        maps.put("apple",30);
        maps.put("orange",20);

        Replit_209 c = new Replit_209();
        c.removeValues(maps);
        maps.entrySet().forEach(x -> System.out.println(x.getKey() +
                " : " + x.getValue()));
    }
}
