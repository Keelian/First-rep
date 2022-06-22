package Pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    @Given("I launch Chrome browser")
    public void iLaunchChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\waqe1\\Downloads\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://google.com");
    }

    @When("Enter user ID and password")
    public void enterUserIDAndPassword() {

    }

    @When("click on Login")
    public void clickOnLogin() {
    }

    @Then("Verify thatyou log in to the page")
    public void verifyThatyouLogInToThePage() {
    }
}
