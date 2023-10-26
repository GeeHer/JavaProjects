package Homework;
/*Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest
salary. Output should be in the below format
John Smith=$100000*/

import java.util.Collections;
import java.util.LinkedHashMap;

public class Employee {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> employee = new LinkedHashMap<>();
        employee.put("Wendy",120000);
        employee.put("Arnold",100000);
        employee.put("Guillermo",110000);
        employee.put("Kiki",90000);

        double maxSalary = (Collections.max(employee.values()));
        var entries = employee.entrySet();
        System.out.println(entries);
        for(var e:entries){
            if(e.getValue()==maxSalary){
                System.out.println(e.getKey()+" =$"+e.getValue());

            }
        }

    }
}
