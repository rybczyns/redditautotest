package bindings;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.RedditDetailsPage;

public class VoteTest extends BaseTest{

    public  RedditDetailsPage redditDetailsPage = new RedditDetailsPage(driver);

    @Given("^I am logged in$")
    public void i_am_logged_in() throws Throwable {
        Assert.assertTrue( "User is not lot logged in!" , redditDetailsPage.checkIfUserLoggedIn());

        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }


    @When("^Reddit was not yet downvoted$")
    public void reddit_was_not_yet_downvoted() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^Click Downvote$")
    public void click_Downvote() throws Throwable {
        redditDetailsPage.upvote();
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^Reddit was downvoted$")
    public void reddit_was_downvoted() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^Click UpVote$")
    public void click_UpVote() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
