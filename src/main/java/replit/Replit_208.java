package replit;
/*Create a Method in Main class using below specification.
Method Name: display.
Return Type: Void
Parameters : Map<String,Integer>
Logic:
First the method will check the given map is empty or not.
If the map is not empty print pairs of key and value using loops
If map is empty simply print "map is empty"
**NOW IN MAIN METHOD**
Create HashMap of String keys and Integer values
add values as below
map.put("mango", 10);
map.put("apple", 30);
map.put("orange", 20);
call above method with these arguments.
then clear the map.
and call above method again.*/

import java.util.HashMap;
import java.util.Map;

public class Replit_208 {

    public void display(Map<String,Integer> str){
        if(str.isEmpty()){
            System.out.println("map is empty");
        } else {
            str.forEach((k,v)-> System.out.println(k+" "+v));
        }
    }

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);

        Replit_208 r = new Replit_208();
        r.display(map);
        map.clear();
        r.display(map);

    }

}
