package Class3;

public class T4TemperatureDay {
    public static void main(String[] args) {
        int expectedTempt=85;
        int actualTempt=90;

        if(expectedTempt>actualTempt){
            System.out.println("It's cooler than expected, wear a jacket!");
        }
        else{
            System.out.println("It's as warm as expected, enjoy your day!");
        }
    }
}
