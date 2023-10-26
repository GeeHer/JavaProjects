package Homework;

public class HWSayHello {
    String country(String countryName){
        if(countryName.equalsIgnoreCase("Spain")){
            return "Hola";
        }
        if(countryName.equalsIgnoreCase("France")){
            return "Bonjour";
        } if(countryName.equalsIgnoreCase("USA")){
            return "Hello";
        } else {
            return "Invalid";
        }
    }
}
