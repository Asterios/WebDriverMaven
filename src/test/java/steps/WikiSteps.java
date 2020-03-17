package steps;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import actions.WikiActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.SeleniumDriver;

public class WikiSteps {

	WikiActions wikiActions = new WikiActions();
	

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String wordToSearch) {
	   
		wikiActions.searchWiki(wordToSearch);
	}

	@Then("^I arrive at the page Software testing$")
	public void i_arrive_at_the_page_Software_testing() {
	    
		String ActualPageTitle= SeleniumDriver.getDriver().getTitle();
		
	    System.out.println("Actual page title-->" +ActualPageTitle);
	    
	    String expectedPageTitle = "Software testing - Wikipedia";
	    System.out.println("Expected page title-->" +expectedPageTitle);
	    
	    
	    Assert.assertEquals(expectedPageTitle, ActualPageTitle);
	}

	@Then("^I get the total number of links$")
	public void i_get_the_total_number_of_links() throws InterruptedException {
	    
		int numberOfLinks = wikiActions.getNumberOfLinks();
		System.out.println("Number of Links: " + numberOfLinks);
		//TimeUnit.SECONDS.sleep(3);
	}
}
