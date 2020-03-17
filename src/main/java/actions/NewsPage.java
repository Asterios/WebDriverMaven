package actions;

import org.openqa.selenium.support.PageFactory;
import locators.NewsLocators;
import utils.SeleniumDriver;

public class NewsPage {
	
	
	NewsLocators newsLocators=null;
	public  NewsPage()
	{
		
		this.newsLocators = new NewsLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), newsLocators);
	}

	public void clickNewspapers()
	{
		
		newsLocators.newspapers.click();
	}
	
	
	
	
}
