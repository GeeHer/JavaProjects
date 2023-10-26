package Class5;

public class E5OROperator {
    public static void main(String[] args) {
        boolean broughtFlowers=true;
        boolean broughtChocolates=false;
        boolean AllMyMistakes=true;

        if(broughtChocolates||broughtFlowers||AllMyMistakes){
            System.out.println("Wife is happy.");
        }else {
            System.out.println("Wife is sad.");
        }
    }
}
