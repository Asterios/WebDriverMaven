package steps;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import actions.NewsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.SeleniumDriver;

public class NewsSteps {

	
	NewsPage news = new NewsPage();
	
	@Given("^I am on the Home Page \"([^\"]*)\"$")
	public void i_am_on_the_Home_Page(String Url)  {
	    
	   SeleniumDriver.openPage(Url);
	}

	@When("^I click on newsapapers$")
	public void i_click_on_newsapapers() {
	    
		System.out.println("Clicking on newspapers");
		news.clickNewspapers();
	}

	@Then("^I should see the list of newsapapers$")
	public void i_should_see_the_list_of_newsapapers() throws Throwable {
	    
		System.out.println("Title of Newspapers");
		
		TimeUnit.SECONDS.sleep(3);
		
		String ActualPageTitle= SeleniumDriver.getDriver().getTitle();
		System.out.println(ActualPageTitle);
		
	    //System.out.println("Actual page title-->"+ActualPageTitle);
	    //System.out.println("Expected page title-->"+expectedPageTitle);
	    //Assert.assertEquals(expectedPageTitle, ActualPageTitle);
	}
}
