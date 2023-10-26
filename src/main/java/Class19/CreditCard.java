package Class19;

public class CreditCard {

    public void calcInterest(double balance) {
        System.out.println(balance * 0.05);
    }
}
     class Visa extends CreditCard{

     }

    class AX extends CreditCard{

        public void calcInterest(double balance) {
            System.out.println(balance*0.07);
        }
    }
class Test{
    public static void main(String[] args) {
        CreditCard c= new CreditCard();
        c.calcInterest(100);

        Visa v= new Visa();
        v.calcInterest(200);
    }
}

