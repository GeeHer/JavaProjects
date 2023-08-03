package Class3;

import java.sql.SQLOutput;

public class T2TemperatureCheck {
    public static void main(String[] args) {
        int temperature = 30;

        if(temperature < 32)
        {
            System.out.println("Water will freeze with temperature " + temperature);
        } else{
            System.out.println("Water will NOT freeze with temperature " + temperature);
        }
    }
}
