package pages;

//import org.openqa.selenium.WebElement;

import com.google.common.base.Predicate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RedditDetailsPage extends HomePage {

//    @FindBy(id = "upvote-button")
//    @FindBy(xpath = "//button[contains(@aria-label,'upvote')]/div")
//    private List<WebElement> subreddit;

    //    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/p[1]")
    @FindBy(xpath = "//*[contains(@data-test-id,'comment')]/div/p")
    private List<WebElement> post;
    @FindBy(id = "CommentSort--SortPicker")
    private WebElement sortingOption;
    @FindBy(xpath = "/html/body/div[4]/a[2]/button")
    private WebElement topOption;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/div[2]/div[1]/a[1]")
    private WebElement loginButton;
    @FindBy (className = "header-user-dropdown")
    private WebElement dropdown;
    @FindBy(xpath="//span[contains(@class,'cu1hzx')]")
    private WebElement successLoginBanner;

    public RedditDetailsPage(WebDriver driver) {
        super(driver);
    }

    public RedditDetailsPage changeSorting() {
        sortingOption.click();
        topOption.click();
        return this;
    }

    public RedditDetailsPage upVote() {
        return this;
    }

    public void printTitle() {
//        wait.until(ExpectedConditions.elementToBeClickable(post.get(0)));
//        wait.until(ExpectedConditions.textToBePresentInElement(post.get(0), " "));
//        wait.until(ExpectedConditions.visibilityOf(post.get(0)));
        if(post.size() ==0){
            printTitle();
        }
        wait.until(ExpectedConditions.visibilityOf(successLoginBanner));
        System.out.println("First 20 characters of top mosts post is: " + post.get(0).getText().substring(0, 20));
    }

    public Boolean checkLoginbuttonAvail() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        if (loginButton.isDisplayed()) {

            return true;
        }

        return false;
    }

    public Boolean checkIfUserLoggedIn(){
//        if(this.dropdown.isDisplayed()){
//            return true;
//        }
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("header-user-dropdown")));
        return true;
    }

    public LoginPage login() {
        loginButton.click();
        return new LoginPage(driver);
    }

    public void upvote(){
//        driver.switchTo().defaultContent();
        WebDriverWait wait = new WebDriverWait(driver,60);
        List<WebElement> subreddit = driver.findElements(By.xpath("//button[contains(@aria-label,'upvote')]"));
//
        wait.until((ExpectedCondition<Boolean>) d -> subreddit.size() >0);

//        wait.until(ExpectedConditions.elementToBeClickable(subreddit.get(0)));
//        wait.until(ExpectedConditions.elementToBeClickable(subreddit.get(0)));
//        isAjaxResponse();
//        wait.until((ExpectedCondition<Boolean>) wd ->
//                ((JavascriptExecutor) wd)
//                        .executeScript("return((window.jQuery != null)  ").equals(true));
//        && (jQuery.active === 0))
//        wait.until((ExpectedCondition<Boolean>) wd ->
//                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
//wait.until(ExpectedConditions.elementToBeClickable(subreddit.get(0)));

////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()[contains(.,'Successfully Logged In')]]")));
//        wait.until((ExpectedCondition<Boolean>) wd ->
//                (checkIfUserLoggedIn().equals(true)));

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("arguments[0].click();",subreddit.get(0));


//        System.out.println(subreddit.size());
        subreddit.get(1).click();
//        try {
//            Thread.sleep(30000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("XD");
    }



//    public boolean isAjaxResponse() {
//        if (isJQueryLoaded() && isJSLoaded()) {
//            return true;
//        }
//        return false;
//    }
//
//    private boolean isJQueryLoaded() {
//        try {
//            wait.until((ExpectedCondition<Boolean>) wd ->
//                    ((JavascriptExecutor) wd)
//                            .executeScript("return((window.jQuery != null) && (jQuery.active === 0))").equals(true));
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//        return true;
//    }
//
//    private boolean isJSLoaded() {
//        try {
//            wait.until((ExpectedCondition<Boolean>) wd ->
//                    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//        return true;
//    }





}
