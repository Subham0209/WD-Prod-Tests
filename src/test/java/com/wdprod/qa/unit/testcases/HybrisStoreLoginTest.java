package com.wdprod.qa.unit.testcases;

import com.wdprod.qa.pages.HomePage;
import com.wdprod.qa.pages.StoreLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;

public class HybrisStoreLoginTest extends StoreLoginPage {

    //protected WebDriver driver;
    StoreLoginPage storeLogin;

    public HybrisStoreLoginTest() {

        super();
        storeLogin = new StoreLoginPage();
    }

    @BeforeClass
    public void setUp(ITestContext context) {
        initialization();
        storeLogin = new StoreLoginPage();
        setDriver(context);
    }

    @Test(priority = 1)
    public void WDStoreLoginTest(){

        navigateToURL("https://www.westerndigital.com/");
        storeLogin.StoreLoginTest();

    }

    @Test(priority=2)
    public void WDLogoImageTest() throws IOException {

        boolean flag2 = storeLogin.validateWDLogo();
        Assert.assertTrue(flag2);

    }


    @Test(priority = 3)
    public void WDStoreInvalidCredTest() throws InterruptedException {
        storeLogin.InvalidCredStoreLoginTest();
    }

    @AfterClass
    public void tearDown() throws IOException
    {
        driver.quit();

    }

}
