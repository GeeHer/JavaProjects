package Class19;

public class Degree {
    public void getPrerequisite(){
        System.out.println("To get a degree you need a high school diploma");
    }
}

 class Bachelors extends Degree{

}

class Masters extends Degree{


    @Override
    public void getPrerequisite() {
        System.out.println("To get a degree you need a masters.");
    }
}

class Tester{

    public static void main(String[] args) {
        new Degree().getPrerequisite();


        new Bachelors().getPrerequisite();


        new Masters().getPrerequisite();

    }
}