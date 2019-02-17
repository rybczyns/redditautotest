package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver){
     this.driver = driver;
     wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);

    }

    public BasePage goToURL(String url){
        driver.get(url);
        return this;
    }
    public String getTitle() {
        return driver.getTitle();

    }

}
