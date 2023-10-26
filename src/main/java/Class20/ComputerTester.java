package Class20;

public class ComputerTester {
    public static void main(String[] args) {
        Computer [] arr={new Apple(),new Dell(), new HP(), new Lenovo()};

        for(Computer cpu:arr){
            cpu.browse();
            cpu.coding();
            cpu.power();

        }
    }
}
