package Class27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2ConfigProperties {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
        String userName = "Admin";
        String password = "Hum@nhrm123";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement userNameField = driver.findElement(By.id("txtUsername"));
        userNameField.sendKeys(userName);

        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        passwordField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.id("btnLogin"));
        loginBtn.click();

    }
}
