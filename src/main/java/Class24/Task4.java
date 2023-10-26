package Class24;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();

        for (int i = 2; i <= 500; i+=2) {
            numbers.add(i);
        }
        System.out.println(numbers);

        /*for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)%5==0){
                numbers.remove(i);
            }

        }*/

        numbers.removeIf(x-> x%5==0);
        System.out.println(numbers);
    }
}
