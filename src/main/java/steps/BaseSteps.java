package steps;

import application.TestProperties;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.qameta.allure.Attachment;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Rogoza Dimity on 06.05.2018.
 */
public class BaseSteps {
    public static WebDriver driver;
    public static String firstUrl;
    public static Properties properties = TestProperties.getInstance().getProperties();

    public static WebDriver getDriver(){
        return driver;
    }

    @Before
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
        driver = new ChromeDriver();
        firstUrl = properties.getProperty("first.url");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(firstUrl);
    }
    @After
    public static void tearDown () {
        driver.quit();
    }

    @Attachment(type = "image/png", value = "Screenshot")
    public static byte[] takeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
