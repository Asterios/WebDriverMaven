package actions;

import java.util.Iterator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import locators.WikiLocators;
import utils.SeleniumDriver;

public class WikiActions {

	WikiLocators wikiLocators=null;
	public  WikiActions()
	{
		
		this.wikiLocators = new WikiLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), wikiLocators);
	}

	public void searchWiki(String wordToSearchFor)
	{
		
		wikiLocators.searchWikipedia.sendKeys(wordToSearchFor);
		wikiLocators.clickToSearchWikipedia.click();
	}
	
	
	public int getNumberOfLinks () {
		
		int number_of_links = wikiLocators.links.size();
		
		/*String url ="";
		Iterator<WebElement> it = wikiLocators.links.iterator();
		while(it.hasNext()) {
			
			url = it.next().getAttribute("href");
			System.out.println(url);
		}*/
		
		return number_of_links;
	}
}
