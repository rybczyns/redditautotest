package bindings;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.RedditDetailsPage;
import pages.SearchPage;

public class ViewRedditTest extends BaseTest{

    private static SearchPage searchpage = new SearchPage(driver);
    private static RedditDetailsPage redditDetailsPage = new RedditDetailsPage(driver);



    @Given("^I have searched for Compensation reddits$")
    public void i_have_searched_for_Compensation_reddits() throws Throwable {
//        System.out.println("title is" + searchpage.getTitle());
        Assert.assertTrue("Search Results not viewed", searchpage.getTitle().contains("reddit.com: search results - "));
    }

    @When("^I click on first rows$")
    public void i_click_on_first_rows() throws Throwable {
//        System.out.println("title is" + searchpage.getTitle());
        searchpage.enterSubbreddit();
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^new page with Reddit will be displayed$")
    public void new_page_with_Reddit_will_be_displayed() throws Throwable {
        searchpage.checkLoadStatus();
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^top most top tile will be printed on screen$")
    public void top_most_top_tile_will_be_printed_on_screen() throws Throwable {
        redditDetailsPage.changeSorting();
        redditDetailsPage.printTitle();
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
