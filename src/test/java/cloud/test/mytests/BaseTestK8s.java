/*
package cloud.test.mytests;

import com.sun.jna.Platform;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTestK8s
{
    WebDriver driver;

    @Parameters({"browser"})
    @BeforeMethod
    public void SetUp(String browserName) throws MalformedURLException {
        System.out.println("browser name is : "+browserName);

        String remoteUrl = "http://" +"alishazia" + ":" + "Zalenium2022" + "@" + "35.222.57.254" + "/wd/hub";
        System.out.println("zalenium hub url is : "+remoteUrl);


        ChromeOptions chromeOptions = new ChromeOptions();
        if(browserName.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();

            chromeOptions.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
                    UnexpectedAlertBehaviour.IGNORE);


            driver = new RemoteWebDriver(new URL(remoteUrl), chromeOptions);
        }

        try
        {
            driver = new RemoteWebDriver(new URL(remoteUrl), chromeOptions);
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
