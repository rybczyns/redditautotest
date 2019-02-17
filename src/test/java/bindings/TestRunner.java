package bindings;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import pages.HomePage;
import org.testng.annotations.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/reddit1",
        format = { "pretty","html: cucumber-html-reports",
                "json: cucumber-html-reports/cucumber.json" },
        dryRun = false
)
public class TestRunner extends BaseTest{
    static WebDriver driver=null;
    @BeforeSuite
    public static void startUp() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
       driver = new FirefoxDriver();
//       HomePage homePage = new HomePage(driver);

//        HomePage homePage=new HomePage(driver);

    }
    @AfterSuite
    public static void tearDown() {
        driver.quit();
    }

}
