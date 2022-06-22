package Day1mav;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.testng.*;
import org.testng.annotations.Test;

public class Testngdemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\waqe1\\Downloads\\chromedriver.exe");
    }

    @Test
    public void demo() {

        System.out.println("Hello World");
    }

    @Test
    public void demo2() {
        System.out.println("Hey world");
    }

    @Test
    public void demo3() {
        System.out.println("Hey there world");
    }


    /**
     * We need Testng to configure our test.
     * TestNG is a framework and JUnit use the same concepts  of
     * Annotations
     * Test Suites
     * Timeouts
     * Parameters for testing based on priority
     * The only difference is dependecies
     * Alot of companies use Maven and TestNg exclusively
     * Annotations are very similar
     * <p>
     * --Before Suite
     * --Before Test
     * --Before Class
     * Before Method
     * --Test
     * --After method
     * --After Class
     * --After Test
     * --After Suite
     */

    public void setupMethod() {


        WebDriverManager.chromedriver().setup();

    }




}
