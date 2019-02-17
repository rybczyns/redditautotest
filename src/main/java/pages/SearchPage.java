package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SearchPage extends BasePage {
//    @FindBy(xpath = "//div[contains(@class,'scrollerItem')]/div[2]/div/div/div/div/a/div")
    @FindBy(xpath = "//*[contains(@id,\"t3_\")]/div[2]/div/div[2]/div[1]/span/a")
    private List<WebElement> subreddit;


    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void enterSubbreddit() {
        subreddit.get(0).click();

    }
    public RedditDetailsPage checkLoadStatus(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CommentSort--SortPicker")));
        return new RedditDetailsPage(driver);
    }


//    public String getTitle(){
//        return "";
//    }
}
