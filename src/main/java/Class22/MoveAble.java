package Class22;

public interface MoveAble {
    public abstract void move();
}

interface WashABle{
    void wash();
}

class Dog implements MoveAble,WashABle{
    @Override
    public void move(){
        System.out.println("Dogs can jump, run, and can move");
    }
    @Override
    public void wash(){
        System.out.println("You can safely wash a Dog");
    }

}

class Car implements MoveAble,WashABle{
    @Override
    public void move(){
        System.out.println("Car can move forward backwards and can go in circles");
    }

    @Override
    public void wash() {
        System.out.println("We can wash a car");
    }
}