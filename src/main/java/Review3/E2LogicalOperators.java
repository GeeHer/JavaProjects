package Review3;

public class E2LogicalOperators {
    public static void main(String[] args) {
        boolean meat=false;
        boolean eggs=true;
        boolean fish=false;
        boolean milk=true;
        boolean veggies=true;

        boolean isProtein=meat||eggs||fish;
        boolean isGoodDiet=meat||eggs||fish && milk && veggies;
        System.out.println(isGoodDiet);


    }
}
