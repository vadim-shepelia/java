package NewJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class GoogleSearchTest {
    static WebDriver driver;
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "/Users/qabot/Downloads/geckodriver");
         driver = new FirefoxDriver();
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

 @Test
    public static void getTitle() {

        driver.get("https://example.com");

        // 4. Трошки зачекати (не найкраще, але просто для прикладу)
        try { Thread.sleep(2000); } catch (InterruptedException e) {}

        // 5. Вивести заголовок сторінки
        System.out.println("Title: " + driver.getTitle());

        driver.quit();
    }
    @Test
    public void findElementAndClick(){
        // 1. Перейти на Google
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button/i")).click();
        driver.quit();
    }
    @Test
    public void addPass(){

        // 1. Перейти на Google
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.quit();
    }
    @Test
    public void errorMessage(){

        // 1. Перейти на Google
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/form/button/i")).click();

        WebElement errorMessage = driver.findElement(By.id("flash"));
        Assert.assertTrue(errorMessage.isDisplayed(), " Your username is invalid! ");
        driver.quit();
    }

}
