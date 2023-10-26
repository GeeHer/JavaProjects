package Class22;

public interface Vehicle {
    void drive();
}


interface Bike extends Vehicle{
    void applyBreaks();

}

class HondaBike implements Bike{
    @Override
    public void drive() {

    }
    @Override
    public void applyBreaks() {

    }
}