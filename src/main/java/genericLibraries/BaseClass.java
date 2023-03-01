package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pomPages.ContactUsPage;
import pomPages.CoreJavaVedioPage;
import pomPages.Homepage;
import pomPages.SeleniumTrainingPage;
import pomPages.SkillraryDemoAppPage;

public class BaseClass {
	
	
	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected HomePage home;
	protected SkillraryDemoAppPage demoapp;
	protected SeleniumTrainingPage selenium;
	protected TestingPage testing;
	protected CoreJavaForSeleniumPage coreJava;
	protected CoreJavaVedioPage javaVedio;
	protected ContactUsPage contact;
	
	
	@BeforeSuite
	//BeforeTest
	
	@BeforeClass
	
	public void classConfiguration()
	{
		property=new PropertiesUtility();
		excel =new ExcelUtility();
		web=new WebDriverUtility();
		
		property.propertiesIntialization(IConstantPath.PROPERTIES_FILE_PATH);
		excel.excelIntialization(IConstantPath.EXCEL_FILE_PATH);
		
				
	}
	
	@BeforeMethod
	
	public void methodConfiguration()
	{
		long time=Long.parseLong(property.fetchproperty("timeouts"));
		driver=web.openApplication(property.fetchproperty("Browser"),
		property.fetchproperty("url"),time);
		
		home=new HomePage(driver);
		Assert.assertTrue(home.getLogo().isDisplayed());
		demoApp=new SkillraryDemoAppPage(driver);
		selenium=new SeleniumTrainingPage(driver);
		testing=new TestingPage(driver);
		coreJava=new CoreJavaForSeleniumPage(driver);
		javaVedio=new CoreJavaVedioPage(driver);
		contact=new ContactUsPage(driver);
	}
	
	@AfterMethod
	public void methodTeardown()
	{
		 web.quitWindow();
	}
	@AfterClass
	public void classTeardown();
	{
		excel.closeExcel();
		
	}
	
	//AfterTest
	//AfterSuite
	
	
	
	
	
		
		
		
	
	
	

}
