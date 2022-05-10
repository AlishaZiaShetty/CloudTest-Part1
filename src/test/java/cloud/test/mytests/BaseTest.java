package cloud.test.mytests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BaseTest
{
    WebDriver driver;

    @BeforeMethod
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91953\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
    }
    public void doLogin()
    {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @Test(priority=1)
    public void checkInventoryItemTest()
    {
        doLogin();
        Assert.assertEquals(6, driver.findElements(By.cssSelector(".inventory_item")).size());
    }

    @Test(priority=2)
    public void addToCartButtonTest()
    {
        doLogin();
        int size = driver.findElements(By.xpath("//button[text()='ADD TO CART']")).size();
        System.out.println("print size :"+size);
    }
   /* @AfterMethod(alwaysRun = true)
    public void tearDown()
    {
        driver.quit();
    }*/
}
