package Homework;
/*Create a property file to store following configurations:
browser=chrome
url=https://facebook.com/
username
password
Read file and extract values of browser & url*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
    public static void main(String[] args) throws IOException {


        String path = System.getProperty("user.dir") + "\\Files\\Homework.properties";
        FileInputStream fis = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fis);

        System.out.println(properties.get("browser"));
        System.out.println(properties.get("url"));
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));


    }
}