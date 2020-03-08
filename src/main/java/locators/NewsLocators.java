package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewsLocators {
	
	
	@FindBy(how=How.XPATH,using="//ul[contains(@class,'main-menu__menubar navmenu navmenu_horizontal main-nav')]//li[5]//a[1]")
	public WebElement newspapers;
	
}