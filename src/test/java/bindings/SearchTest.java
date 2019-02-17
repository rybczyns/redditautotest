package bindings;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.SearchPage;

public class SearchTest extends BaseTest{

    private static HomePage homepage=new HomePage(driver);
    private static SearchPage searchpage;
    private String searchString="";


    @Given("^that I am on the \"([^\"]*)\"")
    public void that_I_am_on_the_www_reddit_com(String url){
       homepage.goToURL(url);
       homepage.wait.until(driver -> driver.getTitle().length()!=0);
       Assert.assertTrue("Main Page not Loaded",homepage.getTitle().equals("reddit: the front page of the internet"));
    }

    @When("^I click on search field and type \"([^\"]*)\"$")
    public void i_click_on_search_field_and_type_searchString(String query) {
        homepage.searchReddit(query);
        searchString=query;
    }

    @When("^I hit Enter Key$")
    public void i_hit_Enter_Key(){
         searchpage = homepage.confirmQueryByEnter();
    }

    @Then("^a page with summary will be viewed$")
    public void a_page_with_summary_will_be_viewed(){
//        System.out.println(searchpage.getTitle());
        Assert.assertTrue("Search Page with results not Loaded",
                searchpage.getTitle().equals("reddit.com: search results - " + searchString));
    }


}
