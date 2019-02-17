package bindings;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver.DriverManagerFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class BaseTest {

    public  static WebDriver driver;

    @BeforeClass
    public static void setup () {
        //Create a Chrome driver. All test classes use this.
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        driver = new FirefoxDriver();


        //Maximize Window
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void teardown () {
        driver.quit();
    }
//    @Before
//    public void setUp() throws IOException {
//
//        String mavenBrowser = System.getProperty("browser");
//        String browser;
//
//        System.out.println("Maven browser: " + mavenBrowser);
//
//        if (mavenBrowser == null) {
//            browser = "chrome";
//        } else browser = mavenBrowser;
//
//        driver = DriverManagerFactory.getManager(browser).getDriver();
////        driver.manage().window().maximize();
//
//    }
//
//    @After
//    public void tearDown() {
//
//        driver.quit();
//    }


}

