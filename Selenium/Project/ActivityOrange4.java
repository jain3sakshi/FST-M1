package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActivityOrange4 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("http://alchemy.hguy.co/orangehrm");

        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Find the username field and enter the username
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");
        // Find the password field and enter the password
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");
        // Find the login button and click it
        driver.findElement(By.id("btnLogin")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        new WebDriverWait(driver, Duration.ofSeconds(5));

        // Find the PIM button and click it
        WebElement PIMText = driver.findElement(By.id("menu_pim_viewPimModule"));
        PIMText.click();

        // Find the Add button and click it
        driver.findElement(By.xpath("//input[@id='btnAdd']")).click();

        // Find the full name field and enter the first name
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sakshi");

        // Find the full name field and enter the last name
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Jain");

        // Find the employee field and enter the value
        driver.findElement(By.xpath("//input[@id='employeeId']")).sendKeys("12345");

        // Find the save button and click
        driver.findElement(By.xpath("//input[@id='btnSave']")).click();

        // Close the browser
        driver.close();
    }
}