package Class20;

public class Computer {
    public void power() {
        System.out.println("This computer can turn on");
    }

    public void browse() {
        System.out.println("Can browse the web");
    }

    public void coding() {
        System.out.println("Can be used to write coding");
    }
}

class Apple extends Computer {
    @Override
    public void coding() {
        System.out.println("Has a harder time writing code");
    }

}

class Lenovo extends Computer {

    @Override
    public void power() {
        System.out.println("Has a long battery life");
    }


}

class HP extends Computer {

    @Override
    public void browse() {
        System.out.println("Has a cleaner interface");
    }


}

class Dell extends Computer {

    @Override
    public void power() {
        System.out.println("Dies fast");

    }

}