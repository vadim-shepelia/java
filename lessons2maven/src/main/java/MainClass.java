import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {
    public static void main (String[] args){
     System.getProperty("webdriver.gecko.driver", "/home/vadim/IdeaProjects/lessons2maven/drivers/chrome/chromedriver*");
       WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/");

    }
}
