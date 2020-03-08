package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchFlightSteps {

	
	@Given("^I am on the Home Page \"([^\"]*)\" of Lufthansa Website$")
	public void i_am_on_the_Home_Page_of_Lufthansa_Website(String arg1) throws Throwable {


		System.out.println("Homepage");
	}

	@When("^I choose From \"([^\"]*)\"$")
	public void i_choose_From(String arg1) throws Throwable {


		System.out.println("Choose From");
	}

	@When("^To \"([^\"]*)\"$")
	public void to(String arg1) throws Throwable {


		System.out.println("Choose To");
	}

	@When("^click on Search_Flights button$")
	public void click_on_Search_Flights_button() throws Throwable {


		System.out.println("Click Search Flights");
	}

	@Then("^I should see list of searched flights$")
	public void i_should_see_list_of_searched_flights() throws Throwable {


		System.out.println("List of Flights");
	}

	@Then("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String arg1) throws Throwable {


		System.out.println("Verify title");
	}


}
