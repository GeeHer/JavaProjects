package Review10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AnimalTester {
    public static void main(String[] args) {
        Animal [] arr = {new Animal(), new Dog(), new Cat()};

        for(Animal a:arr){
            a.speak();
            a.eat();
        }

        ChromeDriver c = new ChromeDriver();
        c.manage().window().maximize();
        c.get("https://www.amazon.com");
        c.getTitle();

        WebDriver [] webDrivers={new ChromeDriver(), new FirefoxDriver(), new EdgeDriver()};

        for (int i = 0; i < webDrivers.length; i++) {
            WebDriver w = webDrivers[i];
            w.manage().window().maximize();
            w.get("https://www.amazon.com");
            System.out.println(w.getTitle());
            w.quit();

        }

    }
}
