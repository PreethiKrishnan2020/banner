package TestData;

import java.util.ArrayList;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import ReadData.TestDataImport;
import excelTestData.bannerTestData;
import objectRepository.AddBannerObject;


public class bannerMainclass {

	static WebDriver driver;
	AddBannerObject obj;
	bannerTestData element;
	String[] datatest;
	String ToVerify ="";
	
	@BeforeSuite
	public void initialize()
	{
		System.setProperty("webdriver.chrome.driver","F:/Selenium/DarsiniAddScorm/src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-uat.darisni.me/auth/login");

	}
	@BeforeClass
	public void Start() 
	{
try {
	
	
	obj = new AddBannerObject(driver);
	TestDataImport Read = new TestDataImport();
	Read.readExcel("Sheet1");
	element = new bannerTestData();
	element.fakerdata(); 
		
	}
	catch (Exception e) {
		System.out.println(e);
	}

}

	@Test
  
	public void mainTest() 
	{
		
		datatest=element.fullbannerdata();

		obj.login(datatest[0], datatest[1]);
		obj.loginFollowUp();
		obj.AddData(datatest[2], datatest[3], datatest[4], datatest[5], datatest[6], datatest[8], datatest[9], datatest[10],Boolean.parseBoolean(datatest[11]));
		obj.LogOut();

		/*
		 * ArrayList<String> Expected = new ArrayList<String>();
		 * 
		 * Expected.add(datatest[j]); 
		 * System.out.println("Expected O/P");
		 * 
		 * for (int j = 0; j < Expected.size(); j++) {
		 * 
		 * System.out.println(j + ":" + Expected.get(j)); }
		 * 
		 * ArrayList<String> ActualList = new ArrayList<String>();
		 * 
		 * ToVerify = obj.TitleTextEnglish.getText(); ActualList.add(0, ToVerify);
		 * 
		 * ToVerify = obj.TitleTextArabic.getText(); ActualList.add(1, ToVerify);
		 * 
		 * 
		 * ToVerify = obj.countryText.getText(); ActualList.add(2, ToVerify);
		 * 
		 * 
		 * ToVerify = obj.GradeText.getText(); ActualList.add(2, ToVerify);
		 * 
		 * ToVerify = obj.startDateText.getText(); ActualList.add(2, ToVerify);
		 * 
		 * 
		 * ToVerify = obj.EndDateText.getText(); ActualList.add(2, ToVerify);
		 * 
		 * 
		 * ToVerify = obj.TargetURLText.getText(); ActualList.add(2, ToVerify);
		 * 
		 * 
		 * ToVerify = obj.LanguageText.getText(); ActualList.add(2, ToVerify);
		 * 
		 * 
		 * ToVerify = obj.StatusText.getText(); ActualList.add(2, ToVerify);
		 * 
		 * 
		 * ToVerify = obj.AvailText.getText(); ActualList.add(2, ToVerify);
		 * 
		 * 
		 * System.out.println("Actual OutPut");
		 * 
		 * for (int i = 0; i < ActualList.size(); i++) {
		 * 
		 * System.out.println(i + ":" + ActualList.get(i)); }
		 */
		
	}
	public static void waitIfElementClickIsIntercepted(WebElement element) {
		WebDriverWait wait10Sec = new WebDriverWait(driver, 10);// for normal explicit wait
		for (int i = 0; i < 20; i++) {
			try {
				wait10Sec.until(ExpectedConditions.visibilityOf(element));
				element.click();
				break;
			} 
	catch (ElementClickInterceptedException e) {
				System.out.println("Click Intercepted: waitIfElementClickIsIntercepted" + element);
			
				}
		}				
	}
	

}
