package com.wdprod.qa.base;


import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;

public class TestBase{

	public static WebDriver driver;
	public static void initialization() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\7344755\\Desktop\\Automation\\ChromeDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		/*options.addArguments("headless");*/
		options.addArguments("window-size=1400,800");
		options.addArguments("disable-gpu");
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		String script = "document.body.style.zoom='0.8';"; // Adjust the zoom level as per your requirement
		jsExecutor.executeScript(script);

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	}

	public static void setDriver(ITestContext context) {
		context.setAttribute("driver", driver);
	}

	protected void navigateToURL(String url)
	{
		driver.get(url);
	}

	public void ClearBrowserCache() {
		driver.manage().deleteAllCookies();
	}

	public static void waitForPageLoaded(WebDriver driver) {
		ExpectedCondition<Boolean> pageLoadCondition = new
				ExpectedCondition<Boolean>() {
					public Boolean apply(WebDriver driver) {
						return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
					}
				};
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(pageLoadCondition);
	}

}
