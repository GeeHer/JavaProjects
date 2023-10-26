package replit;
/*Create a HashMap of String.
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print only the values in upper case using entrySet
**Expected Output:**
265
22180
PATRICK ST
UNITED STATE
VIENNA*/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Replit_205 {
    public static void main(String[] args) {
        HashMap<String, String> address = new HashMap<>();
        address.put("Street", "Patrick ST");
        address.put("Suite", "265");
        address.put("City", "Vienna");
        address.put("Zip", "22180");
        address.put("Country", "United State");

        Set<Map.Entry<String,String>> entries = address.entrySet();
        for (Map.Entry<String,String> e:entries){
            System.out.println(e.getValue().toUpperCase());
        }

    }
}
