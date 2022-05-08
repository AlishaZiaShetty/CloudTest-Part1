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
       // String methodName = name.getName();

        String remoteUrl = "http://" +"alishazia" + ":" + "Zalenium2022" + "@" + "35.235.125.5" + "/wd/hub";
        System.out.println("zalenium hub url is : "+remoteUrl);

      /*  DesiredCapabilities cap = new DesiredCapabilities();
     //   cap.setCapability("name", methodName);
        cap.setCapability(CapabilityType.PLATFORM_NAME, Platform.LINUX);
        cap.setCapability("build", 111.11);
        cap.setCapability("idleTimeout", 180);
        cap.setCapability("recordVideo", true);
        cap.setCapability("tz", "Asia/Kolkata");
        cap.setCapability("browserVersion", "latest");
        cap.setCapability("seleniumVersion", "3.141.59");
*/
        ChromeOptions chromeOptions = new ChromeOptions();
        if(browserName.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            /*cap.setCapability("browserName", "chrome");
            cap.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);*/

            chromeOptions.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
                    UnexpectedAlertBehaviour.IGNORE);


            driver = new RemoteWebDriver(new URL(remoteUrl), chromeOptions);
        }

     /*   if(browserName.equals("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            cap.setCapability(CapabilityType.BROWSER_NAME, BrowserType.FIREFOX);
            *//*cap.setCapability("browserName", "firefox");*//*
        }*/

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
