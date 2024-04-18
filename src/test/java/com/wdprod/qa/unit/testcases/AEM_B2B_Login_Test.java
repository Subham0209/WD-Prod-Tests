package com.wdprod.qa.unit.testcases;

import com.wdprod.qa.base.TestBase;
import com.wdprod.qa.pages.HomePage;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class AEM_B2B_Login_Test extends TestBase {

    HomePage homepage;

    //public WebDriver driver;

    public AEM_B2B_Login_Test() {
        super();
        // This homepage object will be used for other classes to call Homepage Elements.
        homepage = new HomePage();

    }

    @BeforeClass
    public void beforeMethod(ITestContext context)
    {
        initialization();
        // This homepage object will be used for the same class to call Homepage Elements.
        homepage = new HomePage();
        setDriver(context); // Set the driver object in the TestBase class
    }

    @Test(priority=1)
    public void AEMB2BLoginTest() throws InterruptedException, IOException {

        //navigateToURL("https://www.westerndigital.com");
        homepage = homepage.B2BLogin();
        Thread.sleep(3000);

        // Add an assertion to verify login
        String welcomeText = homepage.getWelcomeText();
        Assert.assertTrue(welcomeText.contains("Welcome"), "Welcome text is not displayed or does not match the expected format.");
        //System.out.println(welcomeText);


    }

    @Test (priority=2)
    public void WDLogoImageTest() throws InterruptedException, IOException {

        Thread.sleep(3000);
        boolean flag1 = homepage.validateWDLogo();
        Assert.assertTrue(flag1);

    }


    @Test (priority=3)
    public void LoginPageTitleTest() throws InterruptedException, IOException {

        String title = homepage.validateLoginPageTitle();
        Assert.assertEquals(title, "High-Performance SSDs, HDDs, USB Drives, & Memory Cards | Western Digital");
        Thread.sleep(3000);

    }

    @Test(priority = 4)
    public  void AEMInvalidLoginTest() throws InterruptedException, IOException {

        homepage = homepage.AEMInvalidLogin();

        // Reporting steps

    }

    @AfterClass
    public void tearDown() {

        driver.quit();
    }

}
