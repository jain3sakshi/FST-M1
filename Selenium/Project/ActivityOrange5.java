package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActivityOrange5 {
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

        // Find the My info button and click it
        WebElement MyInfobutton = driver.findElement(By.id("menu_pim_viewMyDetails"));
        MyInfobutton.click();

        // Find edit button and click it
        WebElement editbtn = driver.findElement(By.id("btnSave"));
        editbtn.click();

        // Find first name and remove the value
        WebElement firstName = driver.findElement(By.id("personal_txtEmpFirstName"));
        firstName.click();
        firstName.clear();

        //Enter value in first name
       firstName.sendKeys("Sakshi");

        // Find last name and remove the value
        WebElement lastName = driver.findElement(By.id("personal_txtEmpLastName"));
        lastName.click();
        lastName.clear();

        //Enter value in last name
        lastName.sendKeys("Jain");

        //Click gender as female
        driver.findElement(By.id("personal_optGender_2")).click();

        // Close the browser
        driver.close();
    }
}