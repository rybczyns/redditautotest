package bindings;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import pages.LoginPage;
import pages.RedditDetailsPage;


public class LoginTest extends BaseTest{

public LoginPage loginPage = new LoginPage(driver);
public RedditDetailsPage redditDetailsPage = new RedditDetailsPage(driver);

    @Given("^I am on the BasePage$")
    public void i_am_on_the_BasePage() {
//        loginPage.in
//        Assert.assertTrue("WrongPageLoaded", loginPage instanceof BasePage);
        Assert.assertTrue("LoginPage not loaded", redditDetailsPage.checkLoginbuttonAvail());
        redditDetailsPage.login();
//        redditDetailsPage.
    }

    @When("^I enter u \"([^\"]*)\"$")
    public void i_enter_user(String arg1) throws Throwable {

        loginPage.enterUseranem(arg1);
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I enter p \"([^\"]*)\"$")
    public void i_enter_password(String arg2) throws Throwable {
        loginPage.enterPassword(arg2);
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I click on Login button$")
    public void i_click_on_Login_button() throws Throwable {
        loginPage.loginUsingUsernameAndPassword();
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I am logging$")
    public void i_am_logged_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}