package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity1SD {

    WebDriver driver;
    WebDriverWait wait;

    @Given("User is on Google Home Page")
    public void userIsOnGooglePage() throws Throwable {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://www.google.com/");
    }

    @When("User types Cheese and hits enter")
    public void userTypesInCheeseAndHitsENTER() throws Throwable {
        driver.findElement(By.name("q")).sendKeys("Cheese", Keys.RETURN);
    }

    @Then("Search results are shown")
    public void showHowManySearchResultsWereShown() throws Throwable {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("GCkZZe")));
        String resultStats = driver.findElement(By.className("GCkZZe")).getText();
        System.out.println("Number of results found: " + resultStats);
    }

    @And("Close the browser")
    public void closeTheBrowser() throws Throwable {
        driver.close();
    }

}
