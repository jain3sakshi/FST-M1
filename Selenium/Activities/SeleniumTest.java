package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.util.List;
import java.util.Set;

public class SeleniumTest {

    public static void main(String[] args) {
        //Install firefox driver
        WebDriverManager.firefoxdriver().setup();

        //Initialise firefox driver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/");

        //Interactions

    }
}
