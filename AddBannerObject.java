package objectRepository;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestData.bannerMainclass;

public class AddBannerObject {

	static WebDriver driver;
	
	@FindBy(id = "email")public  WebElement Email;
	@FindBy(id = "password")public  WebElement Password;
	@FindBy(id = ("login-form-submit"))public  WebElement LoginButton;

	@FindBy(xpath = ("//i[@class='fa fa-chevron-down']"))public  WebElement dropdownautomation;
	@FindBy(xpath = ("//a[@rel='noopener noreferrer']"))public  WebElement dropdownAcademy;
	@FindBy(id = "nav-icon2")public static WebElement dropdownMenu;
	@FindBy(linkText="Add Banner") public  WebElement AddBanner;

	@FindBy(xpath = "//input[@formcontrolname='title_en']") public  WebElement TitleEnglish;
	@FindBy(xpath = "//input[@formcontrolname='title_ar']") public  WebElement TitleArabic;
	@FindBy(id="fileInputField1")public  WebElement ImageEnglish;
	@FindBy(xpath = "//img[@xpath='1']") public WebElement previewImageEng;
	@FindBy(id="fileInputField2")public  WebElement ImageArabic;
	@FindBy(xpath = "//img[@src='https://darisni-academy-uat-files.s3.ap-south-1.amazonaws.com/shared/common_ads/1604650263926_de818196851a7c239f7bdec9ecce5729.jpg']") public WebElement previewImageAra;
	@FindBy(xpath = "//input[@placeholder='Start Date']") public  WebElement StartDate;
	@FindBy(xpath = "//input[@placeholder='End Date']")public  WebElement Enddate;
	@FindBy(xpath = "//input[@placeholder='Enter Targe URL']")public  WebElement URL;
	@FindBy(xpath = "//label[contains(text(),'Select Language')]//following::div[4]")public  WebElement SelectLanguage;
	@FindBy(xpath ="//label[text()='English']") public WebElement LangugaeEnglish;
    @FindBy(xpath = "//label[contains(text(),'Select Country')]//following::div[4]") public WebElement CountryClick;
    @FindBy(xpath = "//input[@role='textbox']")public WebElement SearchCountry;
//  @FindBy(xpath="//label[Contains(text(),'Oman']") public  WebElement ListedCountry;
    @FindBy(xpath = "//label[contains(text(),'Select Grade')]//following::div[4]") public WebElement Gradeclick;
    @FindBy(xpath = "//label[text()='Grade Nine - Preparatory']")public  WebElement GradeNine;
	@FindBy(xpath="//select[@formcontrolname='status']")public  WebElement Status;
	@FindBy(xpath = "//option[text()=' Inactive ']")public WebElement InActive;
	@FindBy(xpath = "//input[@id='type']")public  WebElement CheckBoxYes;
	@FindBy(xpath = "//button[@class='btn btn-primary']")public  WebElement Save;
	@FindBy(xpath = "//div[text()='Common ads added successfully']")public WebElement SucessMsg;
	@FindBy(xpath="//i[@title='Logout']") public WebElement ViewPgLogOut;
	@FindBy(xpath = "//span[text()='Yes']")public WebElement ViewPgYes;
	
	
	


//	@FindBy(xpath ="//i[@ptooltip='View Details']")public WebElement ViewBtn;
	
//	@FindBy(xpath ="//h5[@class='card-title']//following::i[1]")public WebElement ViewBtn;
	
	/*
	 * @FindBy(xpath ="//h5[contains(text(),'Banner')]//following::i[1]")public
	 * WebElement ViewBtn;
	 * 
	 * @FindBy(xpath="//h5[text()='View Banner']//following::span[1]")public
	 * WebElement TitleTextEnglish;
	 * 
	 * @FindBy(xpath="//h5[text()='View Banner']//following::span[2]")public
	 * WebElement TitleTextArabic;
	 * 
	 * @FindBy(xpath="//h5[text()='View Banner']//following::span[3]")public
	 * WebElement countryText;
	 * 
	 * @FindBy(xpath="//h5[text()='View Banner']//following::span[4]")public
	 * WebElement GradeText;
	 * 
	 * @FindBy(xpath="//h5[text()='View Banner']//following::span[5]")public
	 * WebElement startDateText;
	 * 
	 * @FindBy(xpath="//h5[text()='View Banner']//following::span[6]")public
	 * WebElement EndDateText;
	 * 
	 * @FindBy(xpath="//h5[text()='View Banner']//following::span[7]")public
	 * WebElement TargetURLText;
	 * 
	 * @FindBy(xpath="//h5[text()='View Banner']//following::span[8]")public
	 * WebElement LanguageText;
	 * 
	 * @FindBy(xpath="//h5[text()='View Banner']//following::span[9]")public
	 * WebElement StatusText;
	 * 
	 * @FindBy(xpath="//h5[text()='View Banner']//following::span[10]")public
	 * WebElement AvailText;
	 */
//	@FindBy(xpath = "//i[@class='fas fa-sign-out-alt logout']")	public  WebElement LogOut;
//	@FindBy(xpath = "//span[text()='Yes']")	public  WebElement Yes;
	@FindBy(xpath = "//span[text()='No']")	public  WebElement No;
	@FindBy(xpath = "//a[text()='Logout']")	public  WebElement DropLogout;
	
	
public AddBannerObject(WebDriver driver) 
{
	AddBannerObject.driver = driver;
	PageFactory.initElements(AddBannerObject.driver, this);
	
}



@Test
public void login(String mail,String password) {

	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(Email));
	Email.sendKeys(mail);//automationnew@mailinator.com
	System.out.println("Entered mailid");
	Password.sendKeys(password);//Strongpassword1
	System.out.println("Entered  Passcode");
	LoginButton.click();
	System.out.println("Opened the Main Page");
}
public void loginFollowUp() {
	
	sleep(2000);
	dropdownautomation.click();
	sleep(2000);
	dropdownAcademy.click();
	sleep(1000);
	ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs2.get(1));
	sleep(2000);
	dropdownMenu.click();
	sleep(3000);
	AddBanner.click();

}
public void AddData(String TitleE,String TitleA,String imageEng,String imageAra,String Countries,String FirstDate,String LastDate,String Link,boolean clickbox) 
{
//	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait (driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(TitleEnglish));
	TitleEnglish.sendKeys(TitleE);//cell2
	wait.until(ExpectedConditions.elementToBeClickable(TitleArabic));
	TitleArabic.sendKeys(TitleA);//cell3
	ImageEnglish.sendKeys(imageEng);//cell4
	
	ImageArabic.sendKeys(imageAra);//cell5
	
	wait.until(ExpectedConditions.elementToBeClickable(CountryClick));
	CountryClick.click();
	SearchCountry.click();           

	String Country = (Countries);//cell6
	String[] AddCountry=Country.split(",");
	System.out.println(AddCountry[0] + AddCountry[1] + AddCountry[2] +AddCountry[3]);
	
    	for(int i=0; i < AddCountry.length;i++) 
	{
		System.out.println(AddCountry[i]);
		SearchCountry.clear();	
		SearchCountry.sendKeys(AddCountry[i]);
	
		WebElement Nation = driver.findElement(By.xpath("//label[contains(text(),'" +AddCountry[i]+ "')]"));
//		driver.findElement(By.xpath("//label[contains(text(),'" + AddCountry[i] + "')]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(Nation));
		Nation.click();
	}
	
	wait.until(ExpectedConditions.elementToBeClickable(Gradeclick));
	Gradeclick.click();
	wait.until(ExpectedConditions.elementToBeClickable(GradeNine));

	GradeNine.click();
	wait.until(ExpectedConditions.elementToBeClickable(StartDate));
	StartDate.sendKeys(FirstDate);//cell8
	wait.until(ExpectedConditions.elementToBeClickable(Enddate));
	Enddate.sendKeys(LastDate);//cell9
	wait.until(ExpectedConditions.elementToBeClickable(URL));
	URL.sendKeys(Link);//cell10
	wait.until(ExpectedConditions.elementToBeClickable(SelectLanguage));
	SelectLanguage.click();
	wait.until(ExpectedConditions.elementToBeClickable(LangugaeEnglish));
	LangugaeEnglish.click();
 	sleep(2000);
 	
	Status.click();
	InActive.click();
	sleep(1000);

	if (clickbox) {
		wait.until(ExpectedConditions.elementToBeClickable(CheckBoxYes));
		CheckBoxYes.click();
		System.out.println("CheckBox is clicked As the value is true");
	}
	else {
		System.out.println("Check box is not clicked as the value is No");
	}
	
//	Save.click();
	sleep(2000);
	String expectedSucessMsg = "Common ads added successfully";
	String actualMessage = SucessMsg.getText();
    Assert.assertEquals(actualMessage, expectedSucessMsg);
    System.out.println("The Datas are saved Successfully");
//	ViewBtn.click();
//	 js.executeScript("window.scrollBy(0,1000)");
//	bannerMainclass.waitIfElementClickIsIntercepted( ViewBtn);
	
}

  public void LogOut() {
	  WebDriverWait wait = new WebDriverWait (driver,20);
	  
  ViewPgLogOut.click();
  wait.until(ExpectedConditions.visibilityOf(ViewPgYes));
  ViewPgYes.click();
  wait.until(ExpectedConditions.visibilityOf(dropdownautomation));
  dropdownautomation.click(); 
  wait.until(ExpectedConditions.visibilityOf(DropLogout)); 
  DropLogout.click();
  sleep(2000); 
  driver.close();  
  driver.quit(); }
 

public static void sleep(long m) {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {

		e.printStackTrace();
	}
}

}


