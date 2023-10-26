package Review13;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E2Config {
    public static void main(String[] args)  {
        String path = "C:\\Users\\User\\IdeaProjects\\JavaProject\\Files\\Config.properties";
        try(FileInputStream fis = new FileInputStream(path);){
            Properties properties = new Properties();
            properties.load(fis);
            System.out.println(properties.getProperty("browser"));
        }

        catch(IOException io){
            System.out.println("Please check the file that yo are trying to read");
            // Send an email / report to the team.
            // Having a backup code like create new file if the one from above path not found
        }
        }
    }

