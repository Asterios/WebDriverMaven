package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
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
