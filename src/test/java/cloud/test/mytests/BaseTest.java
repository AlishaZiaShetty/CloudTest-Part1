/*
package cloud.test.mytests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest
{
    WebDriver driver;

    @Parameters({"browser", "platform"})
    @BeforeMethod
    public void SetUp(String browserName, String platformName, Method name)
    {
        System.out.println("browser name is : "+browserName);
        String methodName = name.getName();

        MutableCapabilities sauceOpts = new MutableCapabilities();
        sauceOpts.setCapability("name", methodName);
        sauceOpts.setCapability("build", "Java-W3C-Examples");
        sauceOpts.setCapability("seleniumVersion", "3.141.59");
        sauceOpts.setCapability("username", "oauth-alishaziashetty-190a6");
        sauceOpts.setCapability("accessKey", "fbd15803-537d-41ad-9050-c09462b1bbcf");
        sauceOpts.setCapability("tags", "w3c-chrome-tests");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("sauce:options", sauceOpts);
        cap.setCapability("browserVersion", "latest");
        cap.setCapability("platformName", platformName);

        if(browserName.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            cap.setCapability("browserName", "chrome");
        }

        if(browserName.equals("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            cap.setCapability("browserName", "firefox");
        }

        try
        {
            driver = new RemoteWebDriver(new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub"), cap);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }

        catch (MalformedURLException e)
        {
           e.printStackTrace();
        }
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown()
    {
        driver.quit();
    }
}
*/
