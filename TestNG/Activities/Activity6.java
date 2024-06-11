import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {

    WebDriver driver;

    @BeforeTest
    public void beforeClass() {
        // Set up the Firefox driver
        //WebDriverManager.firefox().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @Test
    @Parameters({"username", "password"})
    public void loginTest(String username, String password){
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        //Enter credentials- manually
        //username.sendKeys("admin");
        //password.sendKeys("password");

        //Enter values prom xml parameter
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);

        //Click login
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        //Read login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals("Welcome Back, admin", loginMessage);

    }

    @AfterTest
    public void afterClass() {
        //Close the browser
        driver.close();
    }
}

