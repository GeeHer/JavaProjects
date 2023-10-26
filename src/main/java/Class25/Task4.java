package Class25;

import java.util.LinkedHashSet;

public class Task4 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Hyattsville");
        cities.add("Chicago");
        cities.add("Atlanta");
        cities.add("Albany");
        cities.add("Burbank");

        cities.removeIf(x-> x.toLowerCase().startsWith("a"));
        System.out.println(cities);

    }
}
