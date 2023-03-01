package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SkillraryDemoAppPage {
	//declaration
	@FindBy(xpath ="//div[@class='navbar-header']")
	private WebElement pageHeader;
	
	@FindBy(id="Course")
	private WebElement courseTab;
	
	@FindBy(xpath ="//span[@class='wrappers']/a[.='Selenium Training']")
	private WebElement seleniumTrainingLink;
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement categoryDropDown;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactUsLink;
	
	//initialization
	
	public void SkillraryDemoappPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}  
	
	
	//utilization
	public String getPageHeader() {
		return pageHeader.getText();
	}
	public void mouseHoverToCourse(WebDriverUtility web) {
		web.mouseHover(courseTab);
	}
	public void clickSeleniumTraining() {
		seleniumTrainingLink.click();
	}
	public void selectCatagory(WebDriverUtility web,int index) {
		web.dropdown(categoryDropDown,index);
	}
	public void clickContactUs() {
		contactUsLink.click();
		
	}
	

}
