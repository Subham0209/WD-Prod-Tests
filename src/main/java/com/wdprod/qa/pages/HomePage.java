package com.wdprod.qa.pages;

import com.wdprod.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class HomePage extends TestBase {

	// PageFactory - Object Repository:
	@FindBy(xpath = "//a[normalize-space()='']//img[@title='Western Digital Logo']")
	WebElement WDLogo;

	@FindBy(xpath = "//button[@role='button']//span")
	WebElement SignInLink;

	@FindBy(className = "signInBTN")
	WebElement SignInButton;

	@FindBy(xpath = "//select[@id='login-selection']" )
	WebElement loginSelection;

	@FindBy(xpath = "//a[contains(@href, '/store/business/login')]")
	WebElement continueToSignIn;

	@FindBy(id = "j_username")
	WebElement Username;

	@FindBy(id = "j_password")
	WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement SubmitSignIn;

	@FindBy(xpath = "//button[normalize-space()='Our Brands']")
	WebElement Brands;

	@FindBy(xpath = "//button[normalize-space()='Products']")
	WebElement Products;

	@FindBy(xpath = "//button[normalize-space()='Solutions']")
	WebElement Solutions;

	@FindBy(xpath = "//button[normalize-space()='Support']")
	WebElement Support;

	@FindBy(xpath = "//button[normalize-space()='Company']")
	WebElement Company;

	@FindBy(xpath = "//span[@class='hidden md:block sh-sign-in-myAccount']")
	WebElement AccountsLink;

	@FindBy(xpath = "//a[contains(@href, 'store/business/logout')]/@href")
	WebElement logoutlink;

	@FindBy(xpath = "//span[@class='text-xs lg:text-sm mr-1 pr-px hidden md:block pb-2']")
	WebElement welcometext;

	// Forget Password Web-Elements
	@FindBy(xpath = "//button[@class='text-black underline hover:text-blue cursor-pointer text-xs forgetPassModal']")
	WebElement forgetpasswordlink;

	@FindBy(name="email")
	WebElement emailaddress;

	@FindBy(xpath = "//button[@class = 'py-3 px-16 bg-black text-white text-md border border-black hover:bg-black-1 w-full']")
	WebElement submitbtn;

	@FindBy(xpath = "//button[@data-target='#forgetPassModal' and contains(@class, 'defaultBtn') and contains(@class, 'bg-blue')]")
	WebElement okbtn;

	@FindBy(xpath = "//p[@class='text-black mb-0']")
	WebElement errormessage;

	@FindBy(id = "signInName")
	WebElement emailAddress;

	@FindBy(id = "password")
	WebElement pass;

	@FindBy(id="next")
	WebElement submitSign;

	// Initializing the Page Objects:
	public HomePage() {

		PageFactory.initElements(driver, this);

	}

	// Actions:

	public String validateLoginPageTitle() {

		return driver.getTitle();

	}

	public HomePage logout() throws InterruptedException {
		AccountsLink.click();
		Thread.sleep(2000);
		return new HomePage();

	}

	public void ClearBrowserCache() {
		driver.manage().deleteAllCookies();
	}

	public boolean validateWDLogo() {
		return WDLogo.isDisplayed();
	}


	public HomePage B2BLogin() throws InterruptedException
	{
		SignInLink.click();
		SignInButton.click();
		Thread.sleep(3000);
		loginSelection.click();
		Actions actions = new Actions(driver);
		Select se = new Select(loginSelection);
		actions.sendKeys(Keys.TAB).perform();
		se.selectByIndex(2);
		Thread.sleep(3000);
		actions.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.ENTER).perform();
		//continueToSignIn.click();
		Thread.sleep(10000);
		emailAddress.sendKeys("subhamdas8+1001@yopmail.com");
		pass.sendKeys("West@12345678.");
		submitSign.click();
		return new HomePage();
	}

	public HomePage Login() throws InterruptedException
	{
		SignInLink.click();
		SignInButton.click();
		loginSelection.click();
		Select se = new Select(loginSelection);
		// Select the option by index
		se.selectByIndex(1);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//continueToSignIn.click();
		Username.sendKeys("subhamdas7@gmail.com");
		Password.sendKeys("West@12345678.");

		SubmitSignIn.click();
		Thread.sleep(5000);
		return new HomePage();
	}

	public HomePage validateHeaders() throws IOException {

		Brands.click();
		Products.click();
		Solutions.click();
		Support.click();
		Company.click();

		return new HomePage();

	}

	public HomePage AEMInvalidLogin() throws InterruptedException {
		AccountsLink.click();
		logoutlink.click();
		Thread.sleep(3000);
		SignInLink.click();
		SignInButton.click();
		Username.sendKeys("subhamdas7+16@gmail.com");
		Password.sendKeys("West@12345678");
		SubmitSignIn.click();
		Thread.sleep(3000);
		return new HomePage();

	}

	// Method to get the welcome text
	public String getWelcomeText()
	{
		return welcometext.getText();
	}

	public void AEM_ForgetPassword() throws InterruptedException {
		SignInLink.click();
		Thread.sleep(1000);
		SignInButton.click();
		forgetpasswordlink.click();
		Thread.sleep(1000);
		emailaddress.sendKeys("subhamdas7+15@gmail.com");
		Thread.sleep(1000);
		submitbtn.click();
		Thread.sleep(1000);
		okbtn.click();
	}

	public void getForgetpasswordlink() throws InterruptedException {
		SignInLink.click();
		SignInButton.click();
		forgetpasswordlink.click();
		Thread.sleep(1000);
		emailaddress.clear();
		Thread.sleep(1000);
		emailaddress.sendKeys("subhamdas7+15@gmail.com");
		Thread.sleep(1000);
		submitbtn.click();
		Thread.sleep(2000);
	}

	public String getErrorMessage()
	{
		// Get the text content of the error message element
		String errorMessage = errormessage.getText();
		return errorMessage;

	}

	public void Checkout_Steps() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='shipmentAddressSubmit']/span")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("deliveryMethodSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("number")).click();
		driver.findElement(By.id("number")).clear();
		driver.findElement(By.id("number")).sendKeys("4111111111111111");
		driver.findElement(By.id("exp-month")).click();
		new Select(driver.findElement(By.id("exp-month"))).selectByVisibleText("08");
		driver.findElement(By.xpath("//option[@value='08']")).click();
		driver.findElement(By.id("exp-year")).click();
		new Select(driver.findElement(By.id("exp-year"))).selectByVisibleText("2028");
		driver.findElement(By.xpath("//option[@value='2028']")).click();
		driver.findElement(By.id("cvc")).click();
		driver.findElement(By.id("cvc")).clear();
		driver.findElement(By.id("cvc")).sendKeys("555");
		driver.findElement(By.xpath("//*[@id=\"ord-submit-btn\"]")).click();
		// driver.findElement(By.xpath("//h1")).click();
		Thread.sleep(7000);

	}

}