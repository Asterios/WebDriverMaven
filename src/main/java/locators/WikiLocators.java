package locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WikiLocators {

	@FindBy(how=How.XPATH,using="//input[@id='searchInput']")
	public WebElement searchWikipedia;
	
	@FindBy(how=How.NAME, using="go")
	public WebElement clickToSearchWikipedia;
	
	@FindBy(how=How.TAG_NAME, using="a")
	public List<WebElement> links;
}
