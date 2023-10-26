package Class10;

public class CarTest {
    public static void main(String[] args) {
        Car sedan=new Car();
        sedan.make="Honda";
        sedan.model="Civic";
        sedan.color="Black";
        sedan.doors=4;
        sedan.drive();

        Car suv=new Car();
        suv.make="Toyota";
        suv.model="Rav4";
        suv.color="White";
        suv.doors=4;
        suv.drive();

        Car truck=new Car();
        truck.make="Ford";
        truck.model="F-150";
        truck.color="Grey";
        truck.doors=2;
        truck.drive();
    }
}
