package Class10;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1=new Phone();
        phone1.brand="iPhone";
        phone1.price=999.99;
        phone1.color="Black";
        phone1.call();
        System.out.println(phone1.brand);
        System.out.println(phone1.price);
        System.out.println(phone1.color);

        Phone phone2=new Phone();
        phone2.brand="Pixel";
        phone2.price=899.99;
        phone2.color="White";
        phone2.picture();
        System.out.println(phone2.brand);
        System.out.println(phone2.price);
        System.out.println(phone2.color);

        Phone phone3=new Phone();
        phone3.brand="Samsung";
        phone3.price=799.99;
        phone3.color="Blue";
        phone3.alarm();
        System.out.println(phone3.brand);
        System.out.println(phone3.price);
        System.out.println(phone3.color);

    }
}
