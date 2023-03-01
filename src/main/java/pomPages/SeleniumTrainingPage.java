package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SeleniumTrainingPage {
	
	
	//Declaration
	
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageHeader;
	
	@FindBy(id="add")
	private WebElement plusButton;
	
	@FindBy(name=" //button[.=' Add to Cart']")
	private WebElement addToCartButton;
	
	
	@FindBy(name="//div[@id='callout']")
	private WebElement itemAddMessage;
	
	//initialization
		public SeleniumTrainingPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
			
		}
		
		//utilization
		
		public String getPageHeader()
		{
			return pageHeader.getText();
			
	}
		public void doubleClickPlusButton(WebDriverUtility web)
		{
			web.doubleClickonElement(plusButton);
			
		}
		public void clickAddToCart()
		{
			addToCartButton.click();
		}
		public WebElement getItemAddedMessage()
		{
			return itemAddMessage;
		}
		
		
	}



