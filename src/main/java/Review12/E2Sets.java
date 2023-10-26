package Review12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class E2Sets {
    public static void main(String[] args) {
        Set<Integer> number = new HashSet<>();
        number.add(20);
        number.add(10);
        number.add(30);
        number.add(40);


        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(10);
        nums.add(20);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        System.out.println(nums);
        LinkedHashSet<Integer> numSet = new LinkedHashSet<>(nums);
        /*System.out.println(numSet);
        nums = new ArrayList<>(numSet);
        System.out.println(nums);*/
        nums.clear();
        nums.addAll(numSet);

    }
}
