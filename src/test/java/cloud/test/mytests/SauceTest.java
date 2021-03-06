package cloud.test.mytests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SauceTest extends BaseTest
{
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
        Assert.assertEquals(6, driver.findElements(By.xpath("//button[text()='ADD TO CART']")).size());
    }
}
