package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class HomePage  extends BasePage {
    @FindBy(id = "header-search-bar")
    private WebElement searchField;

    public HomePage(WebDriver driver){
        super(driver);
    }


    public void searchReddit(String query){
//       searchField = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(By.id("header-search-bar")));
       searchField =wait.until(
                ExpectedConditions.visibilityOf( searchField));
       searchField.sendKeys(query);

    }

    public SearchPage confirmQueryByEnter(){
        searchField.sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.titleContains("reddit.com: search results - "));//wait till page refreshes
        return new SearchPage(driver);
    }

}
