package Day1mav;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selmav {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\waqe1\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");


    }
}