package Review12;

import java.util.HashMap;
import java.util.Map;

public class E6Maps {
    public static void main(String[] args) {
        Map<String,Double> studentMarksMap = new HashMap<>();
        studentMarksMap.put("Habib",95.5);
        studentMarksMap.put("Madina",95.5);
        studentMarksMap.put("Arthur",89.5);
        studentMarksMap.put("Nelson",95.5);
        System.out.println(studentMarksMap);
        studentMarksMap.replaceAll((k,v)->{
            if (k.contains("a")) {
                return 10.0;
            } else{
                return 0.0;
            }
        });
        System.out.println(studentMarksMap);
    }
}
