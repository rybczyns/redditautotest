package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[contains(@id,'loginUsername')]")
    private WebElement usernameField;
    @FindBy(id = "loginPassword")
    private WebElement passwordField;
    @FindBy(xpath = "//*[contains(@class,'AnimatedForm__submitButton')]")
    private WebElement loginButton;
    @FindBy(xpath="h1.Title")
    private WebElement signinText;
    @FindBy(xpath = "//iframe[contains(@src,'https://www.reddit.com/login/')]")
    private WebElement iframeElement;
    @FindBy (className = "header-user-dropdown")
    private WebElement dropdown;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkSignInavailability(){
        if (signinText.getText().equals("Sign in")){
            return true;
        }
        return false;
    }


    public void enterUseranem(String userName) {
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'https://www.reddit.com/login/')]")));
        wait.until(ExpectedConditions.visibilityOf(usernameField));
        usernameField.sendKeys(userName);


    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public RedditDetailsPage loginUsingUsernameAndPassword() {
//        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
//        wait.until(ExpectedConditions.elementToBeSelected(loginButton));
//        wait.until(ExpectedConditions)
//        loginButton.click();

        WebElement element = driver.findElement(By.xpath("//*[contains(@class,'AnimatedForm__submitButton')]"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        driver.switchTo().defaultContent();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("header-user-dropdown"))));
//        wait.until(ExpectedConditions.visibilityOf(dropdown));
        return new RedditDetailsPage(driver);
    }

}
