

public class Loginsteps {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\waqe1\\Downloads\\chromedriver.exe");
  public void Navigate_to_Url(){
    WebDriver driver = new ChromeDriver();
        @Given(" I launch Chrome browser")
        driver.manage().window().maximize();
        driver.get("http://google.com");
      }





}

