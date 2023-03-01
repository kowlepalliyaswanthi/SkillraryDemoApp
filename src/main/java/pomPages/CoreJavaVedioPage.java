package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaVedioPage {

	
	@FindBy(xpath="//h1[text()='Core Java')]")
	private WebElement pageHeader;
	
	@FindBy(name="")
	private WebElement playButton;
	
	@FindBy(name="")
	private WebElement pauseButton;
	
	
	@FindBy(name="")
	private WebElement addToWishlistTab;
	
	@FindBy(name="")
	private WebElement closeCookiesIcon;
	
	
	//initialization
	public CoreJavaVedioPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	//utilization
	
	public String getPageHeader()
	{
		return pageHeader.getText();
		
}
	public void clickplayButton()
	{
		playButton.click();
		
	}
	public void clickPauseButton()
	{
		pauseButton.click();
	}
	public void clickAddToWishlist()
	{
		addToWishlistTab.click();
	}
	
	public void clickCloseCookies()
	{
		closeCookiesIcon.click();
	}
}
